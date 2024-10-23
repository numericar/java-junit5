package com.unittest;

public class Main {
    public static void main(String[] args) {
        GradeCalculator gradeCalculator = new GradeCalculator();
        System.out.println(gradeCalculator.calculateGrade(50));
        System.out.println(gradeCalculator.calculateGrade(60));
        System.out.println(gradeCalculator.calculateGrade(72));
    }
}