package com.example.designPatterns.structural.composite;

public class CompositePattern {
    public static void main(String[] args) {
        FinancialDepartment financialDepartment = new FinancialDepartment();
        SalesDepartment salesDepartment = new SalesDepartment();

        HeadDepartment headDepartment = new HeadDepartment();
        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(salesDepartment);

        headDepartment.printDepartmentName();
    }
}
