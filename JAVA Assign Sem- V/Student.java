import java.util.Scanner;

public class Student{
  private int roll;
  private int marks;

  //Constructor
  public Student(int roll, int marks){
	this.roll = roll;
	this.marks = marks;
	}

  //isEqual function
  public boolean isEqual(Student otherStudent){
	return this.marks == otherStudent.marks;
	}

    // compare function
    public void compare(Student otherStudent) {
        if (this.marks > otherStudent.marks) {
            System.out.println("Roll number " + this.roll + " has more marks than roll number " + otherStudent.roll);
        } else if (this.marks < otherStudent.marks) {
            System.out.println("Roll number " + otherStudent.roll + " has more marks than roll number " + this.roll);
        } else {
            System.out.println("Both students have the same marks.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first student
        System.out.print("Enter roll number for student 1: ");
        int roll1 = scanner.nextInt();
        System.out.print("Enter marks for student 1: ");
        int marks1 = scanner.nextInt();

        // Input for second student
        System.out.print("Enter roll number for student 2: ");
        int roll2 = scanner.nextInt();
        System.out.print("Enter marks for student 2: ");
        int marks2 = scanner.nextInt();

        // Create instances of Student class
        Student student1 = new Student(roll1, marks1);
        Student student2 = new Student(roll2, marks2);

        // Check if students have equal marks
        boolean isEqual = student1.isEqual(student2);
        System.out.println("Do students have equal marks? " + isEqual);

        // Compare students' marks
        student1.compare(student2);

        // Close the scanner
        scanner.close();
    }
}