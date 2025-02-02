public class tenth_question {
    public static void main(String[] args) {
        // Initialize array with some numbers
        int[] numbers = {5, 10, 15, 20, 25};
        
        // Variable to store sum
        int sum = 0;
        
        // Loop through array to calculate sum
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        // Print the result
        System.out.println("Array elements: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum of all elements: " + sum);
    }
    
}
