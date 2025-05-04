import java.util.Scanner;

    public class StringCount {
    
        public static int countWords(String input) {
            if (input == null || input.trim().isEmpty()) {
                return 0;
            }
            // Split by one or more whitespace characters
            String[] words = input.trim().split("\\s+");
            return words.length;
        }
    
        public static void main(String[] args) {
           
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter anything: ");
            String text=sc.nextLine();
            sc.close();
            int wordCount = countWords(text);
            System.out.println("Number of words: " + wordCount);
        }
    }
    