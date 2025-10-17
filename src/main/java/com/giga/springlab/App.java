package com.giga.springlab;

import com.giga.springlab.annotation.LabClass;
import com.giga.springlab.annotation.UrlMappingLab;

public class App {
    public static void main(String[] args) throws SecurityException {
        UrlMappingLab.displayAllUrlMappingPathValues(LabClass.class);
    }
}
