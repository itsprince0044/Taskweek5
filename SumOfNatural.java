import java.util.Scanner;
public class SumOfNatural {
    public static void sumOfNatural(int number){
        int sum=0;
        for (int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println("The sum of first "+number+" natural is "+sum);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();
        sc.close();
        sumOfNatural(n);
    }
    
}
