package com.example.designPatterns.structural.composite;

//leaf.
public class FinancialDepartment implements Department{
    @Override
    public void printDepartmentName() {
        System.out.println("This is Financial Department");
    }
}
