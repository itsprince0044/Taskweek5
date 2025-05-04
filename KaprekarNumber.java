import java.util.Scanner;
public class KaprekarNumber {
    public static void karprekarNumber(int number){
        int square_number=number*number;
        System.out.println();
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        karprekarNumber(num);
    }
}
