class Student {
    // Fields
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student information
    void displayInfo() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("----------------------------");
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        // Creating student objects
        Student student1 = new Student("Rahul", 101, 92);
        Student student2 = new Student("Priya", 102, 68);

        // Displaying details
        student1.displayInfo();
        student2.displayInfo();
    }
}