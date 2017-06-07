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
public class StudentsCoursesPKTest {
    
    public StudentsCoursesPKTest() {
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
     * Test of getStudentId method, of class StudentsCoursesPK.
     */
    @Test
    public void testGetStudentId() {
        System.out.println("getStudentId");
        StudentsCoursesPK instance = new StudentsCoursesPK();
        int expResult = 0;
        int result = instance.getStudentId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentId method, of class StudentsCoursesPK.
     */
    @Test
    public void testSetStudentId() {
        System.out.println("setStudentId");
        int studentId = 0;
        StudentsCoursesPK instance = new StudentsCoursesPK();
        instance.setStudentId(studentId);
    }

    /**
     * Test of getCourseId method, of class StudentsCoursesPK.
     */
    @Test
    public void testGetCourseId() {
        System.out.println("getCourseId");
        StudentsCoursesPK instance = new StudentsCoursesPK();
        int expResult = 0;
        int result = instance.getCourseId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseId method, of class StudentsCoursesPK.
     */
    @Test
    public void testSetCourseId() {
        System.out.println("setCourseId");
        int courseId = 0;
        StudentsCoursesPK instance = new StudentsCoursesPK();
        instance.setCourseId(courseId);
    }

    /**
     * Test of hashCode method, of class StudentsCoursesPK.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        StudentsCoursesPK instance = new StudentsCoursesPK();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class StudentsCoursesPK.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        StudentsCoursesPK instance = new StudentsCoursesPK();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class StudentsCoursesPK.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        StudentsCoursesPK instance = new StudentsCoursesPK();
        String expResult = "entities.StudentsCoursesPK[ studentId=0, courseId=0 ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
