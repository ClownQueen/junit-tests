package main;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTests {
    private static final long Student_Id = 1;
    private static final String Student_Name = "Adam";
    private static final int First_Grade = 70;
    public static ArrayList<Integer> Grade_List = new ArrayList<>(Arrays.asList(70, 80 ,60));
    public static final double Student_Average = 70;

    @Test
    public void testGetId() {
        Student s1 = new Student();

        s1.getId(Student_Id);

        assertEquals(Student_Id, s1.getId(1));
    }

    @Test
    public void testGetName(){
        Student s1 = new Student();

        s1.getName(Student_Name);

        assertSame(Student_Name, s1.getName("Adam"));
    }

    @Test
    public void testAddGrade(){
        Student s1 = new Student();

        s1.addGrade(First_Grade);

        assertEquals(First_Grade, s1.getGrades().get(0).intValue());

        s1 = new Student();
        for (Integer grade: Grade_List){
            s1.addGrade(grade);
        }
        assertEquals(Grade_List, s1.getGrades());
    }

    @Test
    public void testGetGrades(){
        Student s1 = new Student(1, "Adam");

        assertTrue(s1.getGrades().isEmpty());
    }

    @Test
    public void testGetGradeAverage(){
        Student s1 = new Student();

        for (Integer grade: Grade_List){
            s1.addGrade(grade);
        }

        assertEquals(Student_Average, s1.getGradeAverage(), 1);
    }
}
