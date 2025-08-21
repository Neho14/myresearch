/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author User
 */
public class Student {
        private int student_id;
        private String student_name;
        private String program_name;
        private double[]grades;
        //constructor
        public Student(int student_id, String student_name, String program_name, double[]grades){
                this.student_id = student_id;
                this.student_name = student_name;
                this.program_name = program_name;
                this.grades = grades;
            }
        //calculate GPA
        public double calculateGPA() {
            if (grades.length == 0) return 0.0;
            
            double totalPoints = 0;
            for (double grade : grades) {
                if (grade >= 90) {
                    totalPoints = totalPoints + 4.0;
                }
                else if (grade >= 80) {
                    totalPoints = totalPoints + 3.0;
                }
                else if (grade >= 70) {
                    totalPoints = totalPoints + 2.0;
                }
                else if (grade >= 60) {
                    totalPoints = totalPoints + 1.0;
                }
                else {
                    totalPoints = totalPoints + 0.0;
                }
            }
            return totalPoints / grades.length;
        }
        //method
        public void displayInfo() {
            System.out.println("Student ID: " + student_id);
            System.out.println("Student Name: " + student_name);
            System.out.println("Program Name:" + program_name);
            System.out.println("GPA: " + calculateGPA());
        }
        
    public static void main(String[] args) {
        // TODO code application logic here  
        double[]grades1 = {70, 50, 80, 96};
        double[]grades2 = {50.6, 49.5, 97, 92};
        double[]grades3 = {76, 65.6, 76, 87.4};
        //objects
        Student stu1 = new Student(25001, "Jane", "Computing", grades1);
        Student stu2 = new Student(25002, "Carlos", "Mobile Computing", grades2);
        Student stu3 = new Student(25003, "Lirontsho", "Business", grades3);
        //print information
        stu1.displayInfo();
        stu2.displayInfo();
        stu3.displayInfo();
    }
    
    
}
