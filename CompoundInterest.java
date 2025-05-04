import java.util.Scanner;
public class CompoundInterest {
    public void compoundInterest(double p, double t, double r, double n){
        double A=p*Math.pow(1+(r/(n*100)),n*t);
        double CI=A-p;
        System.out.println("The compound interest of given input is: "+CI);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal=sc.nextDouble();
        System.out.print("Enter time: ");
        double time=sc.nextDouble();
        System.out.print("Enter rate: ");
        double rate=sc.nextDouble();
        System.out.print("Enter number of interest per year: ");
        double number_of_times=sc.nextDouble();
        sc.close();
        CompoundInterest ci=new CompoundInterest();
        ci.compoundInterest(principal,time,rate,number_of_times);

    }
}
