import java.util.*;
public class swap {
    public static void arithmethic(int a , int b){
        System.out.println("Before"+a+" "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After"+a+" "+b);
    }
    public static void tempvar(int a, int b){
         System.out.println("Before"+a+" "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After"+a+" "+b);
    }
    public static void xor(int a, int b){
        System.out.println("Before"+a+" "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After"+a+" "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a&b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        arithmethic(a, b);
        tempvar(a, b);
        xor(a, b);
    }
    
}
