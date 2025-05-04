import java.util.Scanner;
public class Duck {
    public static void duckNumber(int number){
        String n=String.valueOf(number);
        if(n.contains("0")){
            if(n.charAt(0)=='0'){
                System.out.println("Given number "+number+" is not a duck number.");
            }
            else{
                System.out.println("Given number "+number+" is a duck number.");
            }
        }
        else{
            System.out.println("Given number "+number+" is not a duck number.");
        }
        }
    public static void main(String[]agrs){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        duckNumber(num);
    }
    
}
