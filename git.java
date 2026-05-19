import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        int marks = -1; 

        try {
            System.out.print("Enter Marks (0-100): ");
            marks = input.nextInt();

            if (marks < 0 || marks > 100)
                throw new Exception("Invalid Marks");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;  
        }

        String grade;
        if (marks >= 80)
            grade = "A";
        else if (marks >= 70)
            grade = "B";
        else if (marks >= 60)
            grade = "C";
        else
            grade = "F";

        double percentage = (marks / 100.0) * 100;

       
        System.out.println("Student:    " + name);
        System.out.println("Marks:      " + marks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade:      " + grade);

        if (marks >= 50) {
            System.out.println("Status:     Pass");
        } else {
            System.out.println("Status:     Fail");
        }
    }
}
