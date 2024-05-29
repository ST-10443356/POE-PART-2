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
public class TaskTest {
    
    public TaskTest() {
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
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
public void testTaskDescription() {
    Task task1 = new Task("TO DO", "Robyn", "Harrison", 1, "TaskName", "Task successfully captured", 5);
    assertTrue(task1.checkTaskDescription());

    Task task2 = new Task("TO DO", "Mike", "Smith", 2, "TaskName", "Please enter a description of less than 50 characters", 5);
    assertFalse(task2.checkTaskDescription());
}

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
public void testCreateTaskID() {
    Task task = new Task("TO DO", "Robyn", "Harrison", 1, "TaskName", "Description", 5);
    assertEquals("AD:1:BYN", task.createTaskID());
}

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        Task instance = null;
        String expResult = "";
        String result = instance.printTaskDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class Task.
     */
    @Test
    public void testGetDuration() {
        POEPart2 manager = new POEPart2(2);
        
        Task task1 = new Task("TO DO", "Robyn", "Harrison", 1, "TaskName", "Description", 10);
        Task task2 = new Task("TO DO", "Mike", "Smith", 2, "TaskName", "Description", 12);
        Task task3 = new Task("TO DO", "Jane", "Smith", 2, "TaskName", "Description", 12);
        Task task4 = new Task("TO DO", "Lisa", "Mutton", 2, "TaskName", "Description", 12);
        Task task5 = new Task("TO DO", "Leanne", "Harrison", 2, "TaskName", "Description", 12);
        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);
        manager.addTask(task4);
        manager.addTask(task5);
        
        assertEquals(22, manager.returnTotalHours());
    }
}
    

