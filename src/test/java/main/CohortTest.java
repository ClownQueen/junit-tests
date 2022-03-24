package main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CohortTest {

    Cohort emptyCohort;
    Cohort oneCohort;
    Cohort manyCohorts;

    @Before
    public void setUp(){

        emptyCohort = new Cohort();
        oneCohort = new Cohort();
        manyCohorts = new Cohort();

        Student s1 = new Student(2,"Poppy");
        Student s2 = new Student(3,"Freddy");
        Student s3 = new Student(4,"Thorne");

        s1.addGrade(100);
        s2.addGrade(80);
        s3.addGrade(90);

        s1.addGrade(100);
        s2.addGrade(80);
        s3.addGrade(90);

        s1.addGrade(100);
        s2.addGrade(80);
        s3.addGrade(90);

        oneCohort.addStudent(new Student(1, "Riley"));

        manyCohorts.addStudent(s1);
        manyCohorts.addStudent(s2);
        manyCohorts.addStudent(s3);
    }

    @Test
    public void testOneCohort(){
        assertEquals(1, oneCohort.getStudents().size());
    }

    @Test
    public void testManyCohorts() {
        assertEquals(90, manyCohorts.getCohortAverage(), 1);
    }
}
