import java.util.Scanner;

class Student {

    // Five fields
    String name;
    int studentId;
    int age;
    String course;
    double grade;

    // Constructor
    Student(String name, int studentId, int age, String course, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    // Method 1: Display all information
    void displayInfo() {
        System.out.println("\n===== STUDENT INFORMATION =====");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade);
    }

    // Method 2: Perform an action
    void study() {
        System.out.println("\n" + name + " is studying for the next exam.");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get values from the user
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Clear the newline

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        System.out.print("Enter grade: ");
        double grade = scanner.nextDouble();

        // Create an object using the constructor
        Student student = new Student(name, studentId, age, course, grade);

        // Call the methods
        student.displayInfo();
        student.study();

        scanner.close();
    }
}
