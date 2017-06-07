/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.StudentsCourses;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;
import javax.ws.rs.core.PathSegment;
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
public class StudentsCoursesFacadeRESTTest {
    static EJBContainer container;
    static StudentsCoursesFacadeREST instance;
    
    public StudentsCoursesFacadeRESTTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws NamingException {
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        instance = (StudentsCoursesFacadeREST)container.getContext().lookup("java:global/classes/StudentsCoursesFacadeREST");
    }
    
    @AfterClass
    public static void tearDownClass() {
        container.close();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of edit method, of class StudentsCoursesFacadeREST.
     */
    @Test
    public void testEdit_GenericType() throws Exception {
        System.out.println("edit");
        StudentsCourses entity = null;
        instance.edit(entity);
        container.close();
    }

    /**
     * Test of remove method, of class StudentsCoursesFacadeREST.
     */
    @Test
    public void testRemove_GenericType() throws Exception {
        System.out.println("remove");
        StudentsCourses entity = null;
        instance.remove(entity);
    }

    /**
     * Test of find method, of class StudentsCoursesFacadeREST.
     */
    @Test
    public void testFind_Object() throws Exception {
        System.out.println("find");
        Object id = null;
        StudentsCourses expResult = null;
        StudentsCourses result = instance.find(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of findRange method, of class StudentsCoursesFacadeREST.
     */
    @Test
    public void testFindRange_intArr() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        List<StudentsCourses> expResult = null;
        List<StudentsCourses> result = instance.findRange(range);
        assertEquals(expResult, result);
    }

    /**
     * Test of count method, of class StudentsCoursesFacadeREST.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
    }

    /**
     * Test of create method, of class StudentsCoursesFacadeREST.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        StudentsCourses entity = null;
        instance.create(entity);
    }

    /**
     * Test of edit method, of class StudentsCoursesFacadeREST.
     */
    @Test
    public void testEdit_PathSegment_StudentsCourses() throws Exception {
        System.out.println("edit");
        PathSegment id = null;
        StudentsCourses entity = null;
        instance.edit(id, entity);
    }

    /**
     * Test of remove method, of class StudentsCoursesFacadeREST.
     */
    @Test
    public void testRemove_PathSegment() throws Exception {
        System.out.println("remove");
        PathSegment id = null;
        instance.remove(id);
    }

    /**
     * Test of find method, of class StudentsCoursesFacadeREST.
     */
    @Test
    public void testFind_PathSegment() throws Exception {
        System.out.println("find");
        PathSegment id = null;
        StudentsCourses expResult = null;
        StudentsCourses result = instance.find(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of findAll method, of class StudentsCoursesFacadeREST.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        List<StudentsCourses> expResult = null;
        List<StudentsCourses> result = instance.findAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of findRange method, of class StudentsCoursesFacadeREST.
     */
    @Test
    public void testFindRange_Integer_Integer() throws Exception {
        System.out.println("findRange");
        Integer from = null;
        Integer to = null;
        List<StudentsCourses> expResult = null;
        List<StudentsCourses> result = instance.findRange(from, to);
        assertEquals(expResult, result);
    }

    /**
     * Test of countREST method, of class StudentsCoursesFacadeREST.
     */
    @Test
    public void testCountREST() throws Exception {
        System.out.println("countREST");
        String expResult = "";
        String result = instance.countREST();
        assertEquals(expResult, result);
    }
    
}
