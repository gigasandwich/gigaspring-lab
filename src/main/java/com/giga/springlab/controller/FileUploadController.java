package com.giga.springlab.controller;

import com.giga.spring.annotation.controller.*;
import com.giga.spring.annotation.http.DoGet;
import com.giga.spring.annotation.http.DoPost;
import com.giga.spring.annotation.method.JsonResponse;
import com.giga.spring.util.http.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class FileUploadController {
    @DoPost(path = "/file-upload/input-single-upload")
    @JsonResponse
    public String uploadBytes(Map<String, byte[]> files) {
        byte[] file = (files == null) ? null : files.get("file");
        int len = file == null ? 0 : file.length;
        return "Received byte[] size=" + len;
    }

    @DoPost(path = "/file-upload/input-multiple-upload")
    @JsonResponse
    public String uploadListBytes(Map<String, List<byte[]>> files) {
        List<byte[]> list = (files == null) ? null : files.get("files");
        int count = list == null ? 0 : list.size();
        StringBuilder sb = new StringBuilder();
        sb.append("Received List<Byte[]> count=").append(count).append(" sizes=");
        if (list != null) {
            for (byte[] f : list) {
                sb.append(f == null ? 0 : f.length).append(",");
            }
        }
        return sb.toString();
    }
}
