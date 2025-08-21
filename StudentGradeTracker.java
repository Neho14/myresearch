/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgradetracker;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class StudentGradeTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // how many students are in the class
        System.out.print("How many students are in the class? ");
        int numberOfStudents = input.nextInt();

        // Create an array to store the grades
        //length of # grades = number of students
        int[] grades = new int[numberOfStudents];

        // for loop to get each student's grade
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }

        // calculate the total and average
        int sum = 0;
        int i = 0;
        while (i < numberOfStudents) {
            sum += grades[i];
            i++;
        }
        double average = (double) sum / numberOfStudents;
        System.out.println("\nAverage grade is: " + average);

        // find the highest grade
        int highestGrade = grades[0];
        for (int grade : grades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            }
        }
        System.out.println("Highest grade is: " + highestGrade);

        // Count students scored above average
        int aboveAverageCount = 0;
        for (int grade : grades) {
            if (grade > average) {
                aboveAverageCount++;
            }
        }
        System.out.println("Number of students who scored above average: " + aboveAverageCount);

        input.close();
    }
}
