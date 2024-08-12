package com.example.designPatterns.structural.composite;

//leaf element.
public class SalesDepartment implements Department{
    @Override
    public void printDepartmentName() {
        System.out.println("This is Sales Department");
    }
}
