import java.util.Scanner;
public class UpperAndLower {
    public static void counting(String input){
        int count1=0;
        int count2=0;
        for(int i=0;i<=input.length()-1;i++){
            char ch=input.charAt(i);
            if(Character.isUpperCase(ch)){
                count1++;
            }
            else if(Character.isLowerCase(ch)){
                count2++;
            }
        }
        System.out.println("Total number of upper case in given input is "+count1);
        System.out.println("Total number of lower case in given input is "+count2);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String anything=sc.nextLine();
        sc.close();
        counting(anything);
    }
    
}
