/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskmanagementpart2;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Task {
    private String status;
    private String developerFirstName;
    private String developerLastName;
    private int taskNumber;
    private String taskName;
    private String taskDescription;
    private String taskId;
    private int duration;

    public Task(String status, String developerFirstName, String developerLastName, int taskNumber, String taskName, String taskDescription, int duration) {
        this.status = status;
        this.developerFirstName = developerFirstName;
        this.developerLastName = developerLastName;
        this.taskNumber = taskNumber;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskId = createTaskID();
        this.duration = duration;
    }

    public boolean checkTaskDescription() {
        if (this.taskDescription.length() > 50) {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
            return false;
        } else {
            JOptionPane.showMessageDialog(null, "Task successfully captured.");
            return true;
        }
    }

    public String createTaskID() {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerLastName.substring(Math.max(developerLastName.length() - 3, 0)).toUpperCase();
    }

    public String printTaskDetails() {
        return String.format("Status: %s\nDeveloper: %s %s\nTask Number: %d\nTask Name: %s\nTask Description: %s\nTask ID: %s\nDuration: %d hours",
                this.status, this.developerFirstName, this.developerLastName, this.taskNumber, this.taskName, this.taskDescription, this.taskId, this.duration);
    }

    public int getDuration() {
        return this.duration;
    }
}
public class POEPart2{
    private List<Task> tasks = new ArrayList<>();
    private int totalTasks;

    public static String userName;
    public static String password;
    public static String firstName;
    public static String lastName;

    public POEPart2(int totalTasks) {
        this.totalTasks = totalTasks;
    }

    public void addTask(Task task) {
        if (task.checkTaskDescription()) {
            tasks.add(task);
        }
    }

    public int returnTotalHours() {
        int totalHours = 0;
        for (Task task : tasks) {
            totalHours += task.getDuration();
        }
        return totalHours;
    }

    public void displayAllTasks() {
        StringBuilder allTasksDetails = new StringBuilder();
        for (Task task : tasks) {
            allTasksDetails.append(task.printTaskDetails()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, allTasksDetails.toString());
    }

    public void displayWelcomeMessage() {
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
    }

    public static boolean checkUserName(String userName) {
        return userName.contains("_") && userName.length() == 5;
    }

    public static boolean checkPasswordComplexity(String password) {
        return password.matches("(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,}");
    }

    public static void registerUser() {
        boolean result = checkUserName(userName);
        if (result) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters.");
        }

        boolean resultP = checkPasswordComplexity(password);
        if (resultP) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
        }
    }

    public static boolean loginUser() {
        return registeredPassword.equals(password) && registeredUserName.equals(userName);
    }

    public static void returnLoginStatus() {
        if (loginUser()) {
            System.out.println("Welcome " + firstName + ", " + lastName + " it is great to see you again");
        } else {
            System.out.println("Username or password incorrect, please try again.");
        }
    }

    public static void main(String[] args) {
        userName = JOptionPane.showInputDialog(null, "Enter Username");
        password = JOptionPane.showInputDialog(null, "Enter Password");

        if (checkUserName(userName) && checkPasswordComplexity(password)) {
            POEPart2 manager = new POEPart2(0);
            manager.displayWelcomeMessage();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of tasks you wish to enter: ");
            int numTasks = scanner.nextInt();
            scanner.nextLine(); 
            manager = new POEPart2(numTasks);

            while (true) {
                System.out.println("1. Add tasks");
                System.out.println("2. Show report");
                System.out.println("3. Quit");
                System.out.print("Select an option: ");
                int option = scanner.nextInt();
                scanner.nextLine(); 

                if (option == 1) {
                    for (int i = 0; i < numTasks; i++) {
                        System.out.print("Enter task name: ");
                        String taskName = scanner.nextLine();
                        
                        System.out.print("Enter developer first name: ");
                        String devFirstName = scanner.nextLine();
                        
                        System.out.print("Enter developer last name: ");
                        String devLastName = scanner.nextLine();
                        
                        System.out.print("Enter task description: ");
                        String taskDescription = scanner.nextLine();
                        
                        System.out.print("Enter task duration in hours: ");
                        int duration = scanner.nextInt();
                        scanner.nextLine(); 
                        
                        System.out.print("Enter task status (TO DO, DONE, DOING): ");
                        String status = scanner.nextLine();

                        Task task = new Task(status, devFirstName, devLastName, i, taskName, taskDescription, duration);
                        manager.addTask(task);
                    }
                    
                    manager.displayAllTasks();
                    
                } else if (option == 2) {
                    JOptionPane.showMessageDialog(null, "Coming soon");
                } 
                else if (option == 3) {
                    System.out.println("Total hours: " + manager.returnTotalHours());
                    break;
                }
                else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
            scanner.close();
        } 
        
        else {
            System.out.println("Invalid username or password.");
        }
    }
}
