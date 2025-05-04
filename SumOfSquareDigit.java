import java.util.Scanner;
public class SumOfSquareDigit {
    public int sumOfSquareDigit(int number){
        int remainder=0;
        int sum_of_square_digit=0;

        while(number>0){
            remainder=number%10;
            sum_of_square_digit=sum_of_square_digit+remainder*remainder;
            number/=10;
        }
        return(sum_of_square_digit);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        SumOfSquareDigit square=new SumOfSquareDigit();
        int result=square.sumOfSquareDigit(num);
        System.out.println("The sum of square of given digit is "+result);
    }
    
}
