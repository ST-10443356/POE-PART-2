
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package taskmanagementpart2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sihle
 */
public class POEPart2Test {
    
    public POEPart2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addTask method, of class POEPart2.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        Task task = null;
        POEPart2 instance = null;
        instance.addTask(task);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class POEPart2.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        POEPart2 instance = null;
        int expResult = 0;
        int result = instance.returnTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAllTasks method, of class POEPart2.
     */
    @Test
    public void testDisplayAllTasks() {
        System.out.println("displayAllTasks");
        POEPart2 instance = null;
        instance.displayAllTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayWelcomeMessage method, of class POEPart2.
     */
    @Test
    public void testDisplayWelcomeMessage() {
        System.out.println("displayWelcomeMessage");
        POEPart2 instance = null;
        instance.displayWelcomeMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class POEPart2.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String userName = "";
        boolean expResult = false;
        boolean result = POEPart2.checkUserName(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class POEPart2.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        boolean expResult = false;
        boolean result = POEPart2.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class POEPart2.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        POEPart2.registerUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class POEPart2.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        boolean expResult = false;
        boolean result = POEPart2.loginUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class POEPart2.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        POEPart2.returnLoginStatus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class POEPart2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        POEPart2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
