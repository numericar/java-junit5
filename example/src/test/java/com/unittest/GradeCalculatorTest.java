package com.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GradeCalculatorTest {

    private static GradeCalculator gradeCalculator;

    @BeforeAll
    static void setupAll() {
        gradeCalculator = new GradeCalculator();
    }

    @Nested // จัดกลุ่มการทดสอบ
    @DisplayName("Unit test that implement without parameter setup") // ตั้งชื่อการทดสอบ
    class NonParameterTest {
        @Test // ระบุว่า method ใช้สำหรับทดสอบ
        void shouldReturnA() {
            char actual = gradeCalculator.calculateGrade(82);
            char expect = 'A';
    
            // ค่าจะต้องเท่ากัน (ค่าที่ถูกต้อง, ค่าที่ได้รับ)
            assertEquals(expect, actual);
        }
    
        @Test
        void shouldReturnB() {
            char actual = gradeCalculator.calculateGrade(78);
            char expect = 'B';
    
            assertEquals(expect, actual);
        }
    
        @Test
        void shouldReturnC() {
            char actual = gradeCalculator.calculateGrade(62);
            char expect = 'C';
    
            assertEquals(expect, actual);
        }
    
        @Test
        void shouldReturnD() {
            char actual = gradeCalculator.calculateGrade(52);
            char expect = 'D';
    
            assertEquals(expect, actual);
        }
    
        @Test
        void shouldReturnF() {
            char actual = gradeCalculator.calculateGrade(32);
            char expect = 'F';
    
            assertEquals(expect, actual);
        }
    }

    @Nested
    @DisplayName("Unit tests that implement parameter setup")
    class ParameterTest {
    
        @ParameterizedTest
        @CsvSource({
            "90, 'A'",
            "76, 'B'",
            "63, 'C'",
            "58, 'D'",
            "35, 'F'"
        })
        void shouldReturnCorrectGrade(int score, char expect) {
            char actual = gradeCalculator.calculateGrade(score);
        
            assertEquals(expect, actual);
        }
    }

    @Test 
    void shouldThrowErrorDueToInvalidScore() {
        // เป็นการทดสอบว่าจะเกิด throw exception ที่คาดหวังหรือไม่
        assertThrows(IllegalArgumentException.class, () -> {
            gradeCalculator.calculateGrade(102);
        });
    }
}
