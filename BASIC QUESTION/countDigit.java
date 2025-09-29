import java.util.Scanner;

public class countDigit {
    public static int count(int n){
        int co = 0;
        // while(n>0){
        //     n=n/10;
        //     co++;
        // }

        if(n<0){
                System.out.println("Invalid data");
            }
        for(; n>0;n=n/10){
                co++;
            
        }
        return co;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        
        System.out.println(count(n));
    }
}
