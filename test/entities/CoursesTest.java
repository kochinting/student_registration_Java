/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Collection;
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
public class CoursesTest {
    static Course course1;
    
    public CoursesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        course1= new Course();
        course1.setCourseId(1);
        course1.setCourseName("course1_course_name");
        course1.setCourseDescription("course1_course_description");        
    }
    
    @AfterClass
    public static void tearDownClass() {
        course1.setCourseId(null);
        course1.setCourseName(null);
        course1.setCourseDescription(null); 
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCourseId method, of class Courses.
     */
    @Test
    public void testGetCourseId() {
        System.out.println("getCourseId");
        Integer expResult = 1;
        Integer result = course1.getCourseId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseId method, of class Courses.
     */
    @Test
    public void testSetCourseId() {
        System.out.println("setCourseId");
        Integer courseId = null;
        Courses instance = new Courses();
        instance.setCourseId(courseId);
    }

    /**
     * Test of getCourseName method, of class Courses.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        String expResult = "course1_course_name";
        String result = course1.getCourseName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseName method, of class Courses.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String courseName = "";
        Courses instance = new Courses();
        instance.setCourseName(courseName);
    }

    /**
     * Test of getCourseDescription method, of class Courses.
     */
    @Test
    public void testGetCourseDescription() {
        System.out.println("getCourseDescription");
        String expResult = "course1_course_description";
        String result = course1.getCourseDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseDescription method, of class Courses.
     */
    @Test
    public void testSetCourseDescription() {
        System.out.println("setCourseDescription");
        String courseDescription = "";
        Courses instance = new Courses();
        instance.setCourseDescription(courseDescription);
    }

    /**
     * Test of hashCode method, of class Courses.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Courses instance = new Courses();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Courses.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Courses instance = new Courses();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Courses.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Courses instance = new Courses();
        String expResult = "entities.Course[ courseId=1 ]";
        String result = course1.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStudentsCollection method, of class Courses.
     */
    @Test
    public void testGetStudentsCollection() {
        System.out.println("getStudentsCollection");
        Courses instance = new Courses();
        Collection<Students> expResult = null;
        Collection<Students> result = instance.getStudentsCollection();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentsCollection method, of class Courses.
     */
    @Test
    public void testSetStudentsCollection() {
        System.out.println("setStudentsCollection");
        Collection<Students> studentsCollection = null;
        Courses instance = new Courses();
        instance.setStudentsCollection(studentsCollection);
    }
    
}
