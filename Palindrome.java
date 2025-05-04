import java.util.Scanner;
public class Palindrome {
    public static void  palindrome(int number){
        int remainder;
        int original_number=number;
        int palindromenumber=0;
        int count=0;
        while(number>0){
            remainder=number%10;
            palindromenumber=palindromenumber*10+remainder;
            number=number/10;
        }
        if(original_number==palindromenumber){
            for(int i=1;i<=original_number;i++){
                if(original_number%i==0){
                    count++;
                }
            }
            if(count==2){
            System.out.println(original_number+" is a palindrome prime number.");
        }
            else{
            System.out.println(original_number+" is not a palindrome prime number.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        palindrome(num);

    }
}

