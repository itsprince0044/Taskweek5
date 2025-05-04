import java.util.Scanner;
public class Factors {
    public static void factorsOfNumber(int number){
        System.out.println("All factors of "+number+" is ");
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
        factorsOfNumber(n);
    }
}
