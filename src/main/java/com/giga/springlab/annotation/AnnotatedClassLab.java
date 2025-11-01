package com.giga.springlab.annotation;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.*;

import com.giga.spring.util.ReflectionUtils;

public class AnnotatedClassLab {
    private static AnnotatedClassLab instance;
    
    public static AnnotatedClassLab getInstance() {
        if (instance == null)
            instance = new AnnotatedClassLab();
        return instance;
    }

    public void displayAnnotatedClasses(Class<? extends Annotation> annotation, String basePackage) {
        try {
            Set<Class<?>> foundClasses = ReflectionUtils.getInstance().getClassesAnnotatedWith(annotation, basePackage);
            System.out.println("Annotation " + annotation.toString() + " is used by:");
            foundClasses.forEach(c -> System.out.println("\t" + c.getName()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
}