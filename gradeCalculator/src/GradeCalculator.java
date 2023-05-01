/*
This program is used to calculate the final grade of a module

Program made by Rayan Lee Bopp
*/
import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Use an ArrayList to store the grades of a student in multiple courses
        ArrayList<Double> grades = new ArrayList<>();

        // Use a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter grades for each course
        while (true) {
            System.out.print("Enter grade for the course (or type 'stop' to calculate the grade): ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else {
                try {
                    double grade = Double.parseDouble(input);
                    grades.add(grade);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric value or 'stop'. If you want to enter a number like 5,5 use '.' ");
                }
            }
        }

        // Convert the ArrayList to an array
        double[] gradesArray = new double[grades.size()];
        for (int i = 0; i < grades.size(); i++) {
            gradesArray[i] = grades.get(i);
        }

        // Call the function to calculate the student's GPA
        double gpa = calculateGPA(gradesArray);

        // Determine the letter grade based on the GPA
        String letterGrade;
        String color;
        if (gpa >= 5.5) {
            letterGrade = "Excellent (A)";
            color = "green";
        } else if (gpa >= 4.5) {
            letterGrade = "Good (B)";
            color = "green";
        } else if (gpa >= 4.0) {
            letterGrade = "Satisfactory (C)";
            color = "yellow";
        } else if (gpa >= 3.5) {
            letterGrade = "Sufficient (D)";
            color = "yellow";
        } else {
            letterGrade = "Fail (F)";
            color = "red";
        }

        // Print out the student's GPA, letter grade, and grade category
        System.out.println("GPA: " + gpa);
        System.out.println("Letter grade: " + letterGrade);
        System.out.println("Grade category: " + color);
    }

    // Create a function that accepts the grades array as a parameter and returns the student's GPA
    public static double calculateGPA(double[] grades) {
        double totalPoints = 0.0;
        double totalCredits = 0.0;

        // Use a for loop to iterate through the array and calculate the total grade points
        for (int i = 0; i < grades.length; i++) {
            double credit = 3.0; // assume each course is worth 3 credits
            totalPoints += grades[i] * credit;
            totalCredits += credit;
        }

        double gpa = totalPoints / totalCredits;
        return gpa;
    }
}
