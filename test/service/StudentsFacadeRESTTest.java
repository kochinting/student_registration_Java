/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Courses;
import entities.Students;
import java.util.Collection;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;
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
public class StudentsFacadeRESTTest {
        static EJBContainer container;
        static StudentsFacadeREST instance;
    public StudentsFacadeRESTTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws NamingException {
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        instance = (StudentsFacadeREST)container.getContext().lookup("java:global/classes/StudentsFacadeREST");
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
     * Test of edit method, of class StudentsFacadeREST.
     */
    @Test
    public void testEdit_GenericType() throws Exception {
        System.out.println("edit");
        Students entity = null;
        instance.edit(entity);
    }

    /**
     * Test of remove method, of class StudentsFacadeREST.
     */
    @Test
    public void testRemove_GenericType() throws Exception {
        System.out.println("remove");
        Students entity = null;
        instance.remove(entity);
    }

    /**
     * Test of find method, of class StudentsFacadeREST.
     */
    @Test
    public void testFind_Object() throws Exception {
        System.out.println("find");
        Object id = null;
        Students expResult = null;
        Students result = instance.find(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of findRange method, of class StudentsFacadeREST.
     */
    @Test
    public void testFindRange_intArr() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        List<Students> expResult = null;
        List<Students> result = instance.findRange(range);
        assertEquals(expResult, result);
    }

    /**
     * Test of count method, of class StudentsFacadeREST.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
    }

    /**
     * Test of create method, of class StudentsFacadeREST.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Students entity = null;
        instance.create(entity);
    }

    /**
     * Test of edit method, of class StudentsFacadeREST.
     */
    @Test
    public void testEdit_Integer_Students() throws Exception {
        System.out.println("edit");
        Integer id = null;
        Students entity = null;
        instance.edit(id, entity);
    }

    /**
     * Test of remove method, of class StudentsFacadeREST.
     */
    @Test
    public void testRemove_Integer() throws Exception {
        System.out.println("remove");
        Integer id = null;
        instance.remove(id);
    }

    /**
     * Test of find method, of class StudentsFacadeREST.
     */
    @Test
    public void testFind_Integer() throws Exception {
        System.out.println("find");
        Integer id = null;
        Students expResult = null;
        Students result = instance.find(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of findCourses method, of class StudentsFacadeREST.
     */
    @Test
    public void testFindCourses() throws Exception {
        System.out.println("findCourses");
        Integer id = null;
        Collection<Courses> expResult = null;
        Collection<Courses> result = instance.findCourses(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of findAll method, of class StudentsFacadeREST.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        List<Students> expResult = null;
        List<Students> result = instance.findAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of findRange method, of class StudentsFacadeREST.
     */
    @Test
    public void testFindRange_Integer_Integer() throws Exception {
        System.out.println("findRange");
        Integer from = null;
        Integer to = null;
        List<Students> expResult = null;
        List<Students> result = instance.findRange(from, to);
        assertEquals(expResult, result);
    }

    /**
     * Test of countREST method, of class StudentsFacadeREST.
     */
    @Test
    public void testCountREST() throws Exception {
        System.out.println("countREST");
        String expResult = "";
        String result = instance.countREST();
        assertEquals(expResult, result);
    }
    
}
