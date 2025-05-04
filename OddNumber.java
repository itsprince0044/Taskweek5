import java.util.Scanner;
public class OddNumber{
    public static void oddnumber(int number){
        for (int i=1;i<=number;i++){
            if(i%2!=0){
                System.out.println(i);
        }
        
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =sc.nextInt();
        sc.close();
        oddnumber(num);
    }
}