class Student {
    int roll;
    String name;

    // Default constructor
    public Student() {
        roll = 101;
        name = "Archana";
    }

    // Parameterized constructor
    public Student(int r, String n) {
        roll = r;
        name = n;
    }

    // Copy constructor
    public Student(Student s) {
        roll = s.roll;
        name = s.name;
    }

    // Display method
    public void display() {
        System.out.println("ROLL NO=" + roll + "\tName=" + name);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student(111, "Charvi");
        s2.display();

        Student s3 = new Student(s1); // Copy constructor
        s3.display();
    }
}
