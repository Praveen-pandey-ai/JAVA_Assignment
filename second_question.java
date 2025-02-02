// Implement a program to split a string into words and print each word on a new line.

public class second_question {
    
}
public static void main(String[] args) {
    String text = "Hello I am Praveen";
    String[] words = text.split(" ");
    
    for (String word : words) {
        System.out.println(word);
    }
}