import java.util.*;
public class factorial {
    public int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;    
    }
    public static void main(String[] args) {
        factorial fac = new factorial();
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number:");
        int n = sc.nextInt();
       
        int result = fac.fact(n);
        System.out.println(result);

        
    }
}
