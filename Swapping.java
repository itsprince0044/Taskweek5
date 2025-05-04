import java.util.Scanner;
public class Swapping {
    public static void swapping(int number1,int number2){
        int temp;
        temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("After swapping, first number is "+number1+" and second number is "+number2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        sc.close();
        swapping(num1, num2);
    }
    
}
