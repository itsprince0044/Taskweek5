import java.util.Scanner;
public class HarshadNumber {
    public static void  harshad(int original_number){
        int number=0;
        int remainder=0;
        for (int i=1;i<=original_number;i++){
            remainder=original_number/10;
            number+=remainder;
            original_number=original_number/10;

        }
        if(original_number%number==0){
            System.out.println("Given number is a Harshad number.");
        }
        else{
            System.out.println("Given number is not a Harshad number.");
        }

    }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            sc.close();
            harshad(num);
        }
    }

