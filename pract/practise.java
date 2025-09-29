import java.util.*;
class prac{
    public void palindrome(int num){
        int orginal = num;
        int reversed = 0;

        while(num!=0){
            int digit = num%10;
            reversed = reversed *10 +digit;
            num /=10;
        }
        if(orginal==reversed){
            System.out.println(orginal +" is a palindrome");
        }else{
            System.out.println("No");
        }
    }

    public void prime(double num){
        boolean isPrime = true;

        if(num<=1){
            isPrime = false;
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println("no");
        }
    }

        public void revers(int num){
            int rever = 0;
            while(num!=0){
                int digit = num%10;
                rever = rever*10+digit;
                num /=10;
            }
            System.out.println(rever+" reversed is");
        }
    }

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int num = sc.nextInt();
       // double num1 = sc.nextDouble();

        prac p = new prac();
        //p.palindrome(num);
        //p.prime(num1);
        p.revers(num);
    
    }
}
