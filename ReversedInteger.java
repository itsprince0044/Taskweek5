import java.util.Scanner;
public class ReversedInteger {
    public static void reversed(int number){
        int remainder=0;
        int reversed_number=0;
        while(number>0){
            remainder=number%10;
            reversed_number=reversed_number*10+remainder;
            number/=10;
        }
        System.out.println("The reversed number of given input is: "+reversed_number);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        reversed(num);
    }
    
}
