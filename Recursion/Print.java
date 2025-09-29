public class Print {
    public static void printnum(int n, int e){
        if(n>e){
            return;
        }
        printnum(n+1,e);
        System.out.println(n);
        
    }
    public static void main(String[] args){
        int n = 1;
        printnum(1,6);
    }
}
