package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentGradeTest {

    @Test
    public void testGradeA() {
        StudentGrade obj = new StudentGrade();
        assertEquals("A", obj.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        StudentGrade obj = new StudentGrade();
        assertEquals("B", obj.calculateGrade(85));
    }

    @Test
    public void testGradeC() {
        StudentGrade obj = new StudentGrade();
        assertEquals("C", obj.calculateGrade(75));
    }

    @Test
    public void testFailGrade() {
        StudentGrade obj = new StudentGrade();
        assertEquals("F", obj.calculateGrade(40));
    }

    @Test
    public void testInvalidMarks() {
        StudentGrade obj = new StudentGrade();

        assertThrows(
            IllegalArgumentException.class,
            () -> obj.calculateGrade(110)
        );
    }
}
