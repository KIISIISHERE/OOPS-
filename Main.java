import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Student Details
        System.out.println("====== REPORT CARD ======");
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Class: ");
        String studentClass = input.nextLine();
        
        System.out.print("Enter Semester: ");
        String semester = input.nextLine();
        
        // Subject Scores
        System.out.print("Enter Mathematics Score: ");
        int math = input.nextInt();
        
        System.out.print("Enter English Score: ");
        int english = input.nextInt();
        
        System.out.print("Enter Science Score: ");
        int science = input.nextInt();
        
        System.out.print("Enter Social Studies Score: ");
        int social = input.nextInt();
        
        System.out.print("Enter Computer Score: ");
        int computer = input.nextInt();
        
        // Calculations
        int total = math + english + science + social + computer;
        double average = total / 5.0;
        
        String grade;
        
        if (average >= 70) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else if (average >= 45) {
            grade = "D";
        } else if (average >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }
        
        // Display Report
        System.out.println("\n====== STUDENT REPORT CARD ======");
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Semester: " + semester);
        System.out.println("--------------------------------");
        System.out.println("Mathematics: " + math);
        System.out.println("English: " + english);
        System.out.println("Science: " + science);
        System.out.println("Social Studies: " + social);
        System.out.println("Computer: " + computer);
        System.out.println("--------------------------------");
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);
        System.out.println("Final Grade: " + grade);
        System.out.println("================================");
        
        input.close();
    }
}