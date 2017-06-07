/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TimKo
 */
public class StudentsCoursesTest {
    
    public StudentsCoursesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStudentsCoursesPK method, of class StudentsCourses.
     */
    @Test
    public void testGetStudentsCoursesPK() {
        System.out.println("getStudentsCoursesPK");
        StudentsCourses instance = new StudentsCourses();
        StudentsCoursesPK expResult = null;
        StudentsCoursesPK result = instance.getStudentsCoursesPK();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentsCoursesPK method, of class StudentsCourses.
     */
    @Test
    public void testSetStudentsCoursesPK() {
        System.out.println("setStudentsCoursesPK");
        StudentsCoursesPK studentsCoursesPK = null;
        StudentsCourses instance = new StudentsCourses();
        instance.setStudentsCoursesPK(studentsCoursesPK);
    }

    /**
     * Test of hashCode method, of class StudentsCourses.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        StudentsCourses instance = new StudentsCourses();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class StudentsCourses.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        StudentsCourses instance = new StudentsCourses();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class StudentsCourses.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        StudentsCourses instance = new StudentsCourses();
        String expResult = "entities.StudentsCourses[ studentsCoursesPK=null ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
