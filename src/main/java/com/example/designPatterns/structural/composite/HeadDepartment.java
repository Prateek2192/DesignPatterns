package com.example.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// composite element
public class HeadDepartment implements Department {
    private List<Department> departments = new ArrayList<>();

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public void printDepartmentName() {
        departments.forEach(Department::printDepartmentName);
    }
}
