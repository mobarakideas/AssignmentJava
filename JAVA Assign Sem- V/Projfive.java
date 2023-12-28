import java.util.*;

class Person {
    String Name;
    String Add;

    Person() {
        Name = "";
        Add = "";
    }

    void setPerson(String n, String a) {
        Name = n;
        Add = a;
    }

    void display() {
        System.out.println("Person[Name: " + Name + " | Address: " + Add + "]");
    }
}

class Student extends Person {
    String Program;
    String Year;
    Double Fees;

    void setStudent(String n, String a, String p, String y, Double f) {
        Name = n;
        Add = a;
        Program = p;
        Year = y;
        Fees = f;
    }

    void display() {
        System.out.println("Person[Name: " + Name + " | Address: " + Add + " | Program: " + Program +
                " | Year: " + Year + " | Fees: " + Fees + "]");
    }
}

class Staff extends Person {
    String School;
    Double Pay;

    void setStaff(String n, String a, String s, Double p1) {
        Name = n;
        Add = a;
        School = s;
        Pay = p1;
    }

    void display() {
        System.out.println("Person[Name: " + Name + " | Address: " + Add + " | School: " + School + " | Pay: " + Pay + "]");
    }
}

public class Projfive {
    public static void main(String[] args) {
        Student text = new Student();
        String arr[] = new String[4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of student:");
        arr[0] = sc.nextLine();
        System.out.println("Enter the address of student:");
        arr[1] = sc.nextLine();
        System.out.println("Enter the program of student:");
        arr[2] = sc.nextLine();
        System.out.println("Enter the year of student:");
        arr[3] = sc.nextLine();
        System.out.println("Enter the fees of student:");
        double fees = sc.nextDouble();
        text.setStudent(arr[0], arr[1], arr[2], arr[3], fees);

        Staff text2 = new Staff();
        String arr1[] = new String[3];

        System.out.println("-----------------------");
        String str = sc.nextLine();
        System.out.println("Enter the name of Staff:");
        arr1[0] = sc.nextLine();
        System.out.println("Enter the address of Staff:");
        arr1[1] = sc.nextLine();
        System.out.println("Enter the School of Staff:");
        arr1[2] = sc.nextLine();
        System.out.println("Enter the pay of Staff:");
        double pay = sc.nextDouble();
        text2.setStaff(arr1[0], arr1[1], arr1[2], pay);

        text.display();
        text2.display();
    }
}