public class sum {

    public static int sumN(int n){
        if(n<=1){
            return n;
        }
        return n+sumN(n-1);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sumN(n));
    }
}
