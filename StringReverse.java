// Write a program to reverse a string without using built-in methods.
public class StringReverse {
    public static void main(String[] args) {
        String original = "Hello World";
        char[] charArray = original.toCharArray();
        
        for(int i = 0; i < charArray.length/2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length-1-i];
            charArray[charArray.length-1-i] = temp;
        }
        
        System.out.print("Reversed string: ");
        for(char c : charArray) {
            System.out.print(c);
        }
    }
}