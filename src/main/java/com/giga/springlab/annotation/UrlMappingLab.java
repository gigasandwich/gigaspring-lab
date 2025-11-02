package com.giga.springlab.annotation;

import java.lang.reflect.Method;
import java.util.Map;

import com.giga.spring.util.ScanUtils;

public class UrlMappingLab {
    private static UrlMappingLab instance;

    public static UrlMappingLab getInstance() {
        if (instance == null)
            instance = new UrlMappingLab();
        return instance;
    }

    public void displayAllUrlMappingPathValues(Class<?> clazz) throws SecurityException {
        try {
            Map<String, Method> result = ScanUtils.getInstance().getAllUrlMappingPathValues(clazz);

            for (String key : result.keySet()) {
                StringBuilder sb = new StringBuilder();

                String url = key;
                String methodName = result.get(key).getName();
                String fullMethodName = clazz.getName() + "." + methodName;

                sb.append("URL: ").append(url)
                    .append(" - method: ").append(fullMethodName).append(";");

                System.out.println(sb.toString());
            }
        } catch (SecurityException se) {
            throw se;
        }
    }
}
