import java.util.Scanner;
public class CubeOfNumbe {
    public void cubeOfNumber(int number){
        System.out.println("The cube of "+number+" is "+Math.pow(number,3));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number whoes cube you want: ");
        int n=sc.nextInt();
        sc.close();
        CubeOfNumbe cube=new CubeOfNumbe();
        cube.cubeOfNumber(n);
    }
    
}
