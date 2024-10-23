package com.unittest;

public class GradeCalculator {
    
    public char calculateGrade(int score) {
        if (score < 0 || score > 100) throw new IllegalArgumentException("Input score is invalid");

        if (score >= 80) return 'A';

        if (score >= 70) return 'B';

        if (score >= 60) return 'C';

        if (score >= 50) return 'D';

        return 'F';
    }

}
