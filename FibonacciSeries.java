public class FibonacciSeries {
    public static void fibonacci(){
        int a=0;
        int b=1;
        int c;
        for(int i=1;i<=5;i++){
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;

        }
    }
    public static void main(String[]args){
        fibonacci();
    }
    
}
