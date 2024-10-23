/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class DoctorManagementTest {
    
    public DoctorManagementTest() {
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
     * Test of addDoctor method, of class DoctorManagement.
     */
    @Test
    public void testAddDoctor() {
        System.out.println("addDoctor");
        DoctorManagement instance = new DoctorManagement();
        instance.addDoctor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editDoctor method, of class DoctorManagement.
     */
    @Test
    public void testEditDoctor() {
        System.out.println("editDoctor");
        int id = 0;
        DoctorManagement instance = new DoctorManagement();
        instance.editDoctor(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDoctor method, of class DoctorManagement.
     */
    @Test
    public void testDeleteDoctor() {
        System.out.println("deleteDoctor");
        int id = 0;
        DoctorManagement instance = new DoctorManagement();
        instance.deleteDoctor(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDoctorById method, of class DoctorManagement.
     */
    @Test
    public void testFindDoctorById() {
        System.out.println("findDoctorById");
        int id = 0;
        DoctorManagement instance = new DoctorManagement();
        Doctor expResult = null;
        Doctor result = instance.findDoctorById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchDoctorByName method, of class DoctorManagement.
     */
    @Test
    public void testSearchDoctorByName() {
        System.out.println("searchDoctorByName");
        String name = "";
        DoctorManagement instance = new DoctorManagement();
        instance.searchDoctorByName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortDoctorsByDateOfBirth method, of class DoctorManagement.
     */
    @Test
    public void testSortDoctorsByDateOfBirth() {
        System.out.println("sortDoctorsByDateOfBirth");
        DoctorManagement instance = new DoctorManagement();
        instance.sortDoctorsByDateOfBirth();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayDoctors method, of class DoctorManagement.
     */
    @Test
    public void testDisplayDoctors() {
        System.out.println("displayDoctors");
        DoctorManagement instance = new DoctorManagement();
        instance.displayDoctors();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
