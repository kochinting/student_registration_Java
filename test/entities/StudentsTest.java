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
public class StudentsTest {
    static Students student1;
    
    public StudentsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        student1= new Students();
        student1.setStudentId(1);
        student1.setFirstName("student1_first_name");
        student1.setLastName("student1_last_name");
        student1.setCoursesCollection(null);
    }
    
    @AfterClass
    public static void tearDownClass() {
        student1.setStudentId(null);
        student1.setFirstName(null);
        student1.setLastName(null);
        student1.setCoursesCollection(null);
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStudentId method, of class Students.
     */
    @Test
    public void testGetStudentId() {
        System.out.println("getStudentId");
        Integer expResult = 1;
        Integer result = student1.getStudentId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentId method, of class Students.
     */
    @Test
    public void testSetStudentId() {
        System.out.println("setStudentId");
        Integer studentId = 1;
        Students instance = new Students();
        instance.setStudentId(1);
    }

    /**
     * Test of getFirstName method, of class Students.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        String expResult = "student1_first_name";
        String result = student1.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Students.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Students instance = new Students();
        instance.setFirstName(firstName);
    }

    /**
     * Test of getLastName method, of class Students.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        String expResult = "student1_last_name";
        String result = student1.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Students.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Students instance = new Students();
        instance.setLastName(lastName);
    }

    /**
     * Test of hashCode method, of class Students.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Students instance = new Students();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Students.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Students instance = new Students();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Students.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "entities.Students[ studentId=1 ]";
        String result = student1.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoursesCollection method, of class Students.
     */
    @Test
    public void testGetCoursesCollection() {
        System.out.println("getCoursesCollection");
        Collection<Courses> expResult = null;
        Collection<Courses> result = student1.getCoursesCollection();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoursesCollection method, of class Students.
     */
    @Test
    public void testSetCoursesCollection() {
        System.out.println("setCoursesCollection");
        Collection<Courses> coursesCollection = null;
        Students instance = new Students();
        instance.setCoursesCollection(coursesCollection);
    }
    
}
