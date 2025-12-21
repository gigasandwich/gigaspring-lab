package com.giga.springlab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private Department dept;
    private String[] behaviors;
    private Employee[] friends;
    private Project[][] projects;
}
