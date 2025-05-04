import java.util.Scanner;
public class ConvertingDays {
    public void dayConversion(int days){
        int year=days/365;
        int remainingdays= days%365;
        int month=remainingdays/30;
        int day=remainingdays%30;
        System.out.println("Years="+year);
        System.out.println("Months="+month);
        System.out.println("Days="+day);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number of days: ");
        int d=sc.nextInt();
        sc.close();
        ConvertingDays conversion=new ConvertingDays();
        conversion.dayConversion(d);
    }
    
}
