public class MultiplicationTable {
    public void mulitplication(){
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        MultiplicationTable multi=new MultiplicationTable();
        multi.mulitplication();
    }
}
