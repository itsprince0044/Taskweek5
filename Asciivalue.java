import java.util.Scanner;
public class Asciivalue {
    public static void asciivalue(char ch){
        System.out.println("The ASCII value of given character is: "+(int)(ch));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c=sc.nextLine().charAt(0);
        sc.close();
        asciivalue(c);

    }
    
}
