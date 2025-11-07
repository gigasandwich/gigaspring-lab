package com.giga.springlab.annotation;

import java.lang.annotation.Annotation;
import java.util.*;

import com.giga.spring.util.scan.ClassScanner;

public class AnnotatedClassLab {
    private static AnnotatedClassLab instance;
    
    public static AnnotatedClassLab getInstance() {
        if (instance == null)
            instance = new AnnotatedClassLab();
        return instance;
    }

    public void displayAnnotatedClasses(Class<? extends Annotation> annotation, String basePackage) {
        Set<Class<?>> foundClasses = ClassScanner.getInstance().getClassesAnnotatedWith(annotation, basePackage);
        System.out.println("Annotation '" + annotation.toString() + "' is used by:");
        foundClasses.forEach(c -> System.out.println("\t" + c.getName()));
    }
}