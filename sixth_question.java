// Write a program that uses Java's StringBuilder for efficient string operations.

public class sixth_question {
    
}
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    
    // Append operation
    sb.append(" World");
    
    // Insert operation
    sb.insert(5, " Beautiful");
    
    // Replace operation
    sb.replace(6, 15, "Amazing");
    
    // Delete operation
    sb.delete(5, 6);
    
    // Reverse operation
    sb.reverse();
    
    System.out.println("Final string: " + sb.toString());
}