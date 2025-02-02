public class SingletonExample {
    // Private static instance of the class
    private static SingletonExample instance;
    
    // Private constructor to prevent direct instantiation
    private SingletonExample() {
    }
    
    // Public method to get the instance
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
    
    // Example method of the singleton class
    public void showMessage() {
        System.out.println("Hello from Singleton Class!");
    }
    
    // Main method to test the singleton
    public static void main(String[] args) {
        // Get the singleton instance
        SingletonExample singleton1 = SingletonExample.getInstance();
        SingletonExample singleton2 = SingletonExample.getInstance();
        
        // Both instances will be the same
        singleton1.showMessage();
        System.out.println("Instance 1 hash: " + singleton1.hashCode());
        System.out.println("Instance 2 hash: " + singleton2.hashCode());
    }
}