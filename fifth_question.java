// Show an example of the final keyword for variables, methods, and classes.

// Final class - cannot be inherited
final class FinalExample {
    // Final variable - cannot be modified after initialization
    final double PI = 3.14159;
    
    // Final method - cannot be overridden by subclasses
    final void displayMessage() {
        System.out.println("This is a final method");
    }
    
    public void demonstrateFinal() {
        // Final local variable
        final String MESSAGE = "Hello, World!";
        System.out.println("Final variable PI: " + PI);
        System.out.println("Final local variable MESSAGE: " + MESSAGE);
    }

    public static void main(String[] args) {
        FinalExample example = new FinalExample();
        example.demonstrateFinal();
        example.displayMessage();
    }
}