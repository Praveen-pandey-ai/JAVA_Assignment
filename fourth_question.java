// Write a Java program to showcase the use of this and super keywords.

public class fourth_question {
    
}
class ParentClass {
    int x = 10;
    
    ParentClass() {
        System.out.println("Parent constructor");
    }
    
    void display() {
        System.out.println("Parent x: " + x);
    }
}

class ChildClass extends ParentClass {
    int x = 20;
    
    ChildClass() {
        super();
        System.out.println("Child constructor");
    }
    
    void display() {
        System.out.println("Child x: " + this.x);
        System.out.println("Parent x: " + super.x);
    }
    
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.display();
    }
}