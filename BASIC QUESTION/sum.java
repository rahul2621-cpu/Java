import java.util.*;
public class sum {
    public int su(int n){
        int s = 0;
        for(int i=1;i<=n;i++){
            s = s+i;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        sum summ = new sum();
        int result = summ.su(n);
        System.out.println(result);
    }
    
}
