public class multiply {
    public static int multiply(int a,int b){
        if(b==0){
            return 0;
        }
        return a + multiply(a,b-1);
    }
    public static void main(String[] args) {
       int result = multiply(5, 4);
        System.out.println(result);
    }
}
