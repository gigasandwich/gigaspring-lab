package com.giga.springlab;

import com.giga.spring.annotation.*;
import com.giga.springlab.annotation.UrlMappingLab;
import com.giga.springlab.controller.*;

public class App {
    public static void main(String[] args) throws SecurityException {
        UrlMappingLab.getInstance().displayAllUrlMappingPathValues(ControllerWithAnnotatedMethod.class);
    }
}
