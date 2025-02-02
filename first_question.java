// Write a program to demonstrate encapsulation in Java

class Student {
    private String name;
    private int age;
    private int rollNumber;

    // Constructor
    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}

public class first_question {
    public static void main(String[] args) {
        // Creating student object
        Student student = new Student("John", 20, 101);

        // Accessing data through getter methods
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());

        // Modifying data through setter methods
        student.setName("John Smith");
        student.setAge(21);

        System.out.println("\nUpdated Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}