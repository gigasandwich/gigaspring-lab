package com.giga.springlab.annotation;

import java.lang.reflect.Method;
import java.text.Annotation;

import com.giga.spring.annotation.UrlMapping;

public class UrlMappingLab {

    /* 
     * Displays all the "UrlMapping.path()" values
     * from the methods of clazz
    */
    private static void displayAllUrlMappingPathValues(Class clazz) throws SecurityException {
        try {
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(UrlMapping.class)) {
                    Annotation annotation = method.getAnnotation(UrlMapping.class);
                    
                    StringBuilder sb = new StringBuilder();
                    sb.append("Method: ").append(method.getName()).append("()").append(", ")
                        .append("Path value from the annotation: ").append(annotation.path());

                    System.out.println(sb.toString());
                }
            }
        } catch (SecurityException se) {
            throw se;
        }
    }

}
