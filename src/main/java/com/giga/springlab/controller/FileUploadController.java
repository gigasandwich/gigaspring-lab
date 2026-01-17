package com.giga.springlab.controller;

import com.giga.spring.annotation.controller.*;
import com.giga.spring.annotation.http.DoGet;
import com.giga.spring.annotation.http.DoPost;
import com.giga.spring.annotation.method.JsonResponse;
import com.giga.spring.util.http.ModelAndView;

import java.util.List;
import java.util.Map;
import com.giga.spring.util.file.GigaFile;

@Controller
public class FileUploadController {
    @DoPost(path = "/file-upload/input-single-upload")
    @JsonResponse
    public String uploadBytes(Map<String, GigaFile> files) {
        GigaFile gf = (files == null) ? null : files.get("file");
        byte[] file = (gf == null) ? null : gf.getContent();
        int len = file == null ? 0 : file.length;
        return "Received file size=" + len + " fileName=" + (gf == null ? "" : gf.getFileName() + 
               " extension=" + gf.getExtension());
    }

    @DoPost(path = "/file-upload/input-multiple-upload")
    @JsonResponse
    public String uploadListBytes(Map<String, List<GigaFile>> files) {
        List<GigaFile> list = (files == null) ? null : files.get("files");
        int count = list == null ? 0 : list.size();
        StringBuilder sb = new StringBuilder();
        sb.append("Received files count=").append(count).append(" sizes=");
        if (list != null) {
            for (GigaFile f : list) {
                byte[] b = (f == null) ? null : f.getContent();
                sb.append(b == null ? 0 : b.length).append(",");
            }
        }
        return sb.toString();
    }
}
