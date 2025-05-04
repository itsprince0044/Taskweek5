import java.util.Scanner;
public class SwappingWithoutTemp {
    public void swappingWithoutTemp(int number1,int number2){
        number1=number1^number2;
        number2=number1^number2;
        number1=number1^number2;
        System.out.println("After swapping without temporary varibale, first number is "+number1+" and second number is "+number2);

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        sc.close();
        SwappingWithoutTemp swap=new SwappingWithoutTemp();
        swap.swappingWithoutTemp(num1,num2);
    }
    
}
