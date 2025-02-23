/*
Student Name: Eros Lima Coelho
Student Number: 3151957
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradesTest {

    @Test
    void testGradesMax(){
        Grades grades = new Grades();

//        gives expected value for maxGrade, then using the method in Grades, checks if it works
        assertEquals(75, grades.gradesMax(new int[]{50, 28, 75}));
        assertEquals(-1, grades.gradesMax(new int[]{-1, -28, -75}));
        assertEquals(0, grades.gradesMax(new int[]{0, 0, 0}));
    }

    @Test
    void testGradesMTotal(){
        Grades grades = new Grades();

        //        gives expected value for TotalGrade, then using the method in Grades, checks if it works
        assertEquals(275, grades.gradesTotal(new int[] {75, 100, 100}));
        assertEquals(-275, grades.gradesTotal(new int[] {-75, -100, -100}));
        assertEquals(0, grades.gradesTotal(new int[] {0, 0, 0}));
    }

    @Test
    void testGradesAverage(){
        Grades grades = new Grades();

//      gives expected value for averageGrade, then using the method in Grades, checks if it works
        assertEquals(45, grades.gradesAverage(new int[] {40, 50, 45}));
        assertEquals(-45, grades.gradesAverage(new int[] {-40, -50, -45}));
        assertEquals(0, grades.gradesAverage(new int[] {0, 0, 0}));
    }

    @Test
    void testCountFails(){
        Grades grades = new Grades();

//      gives expected value for countFails, then using the method in Grades, checks if it works
        assertEquals(1, grades.countFails(new int[] {39, 50, 78}, 40));
        assertEquals(2, grades.countFails(new int[] {45, -20, -54}, 40));
        assertEquals(3, grades.countFails(new int[] {0, 0, 0}, 40));
    }
}