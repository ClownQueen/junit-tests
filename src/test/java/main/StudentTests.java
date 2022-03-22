package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class StudentTests {

    @Test
    public void testGetId() {
        Student student1 = new Student();

        student1.getId(1);

        assertEquals(1, student1.getId(1));
    }

    @Test
    public void testGetName(){
        Student student2 = new Student();

        student2.getName("Adam");

        assertSame("Adam", student2.getName("Adam"));
    }
}
