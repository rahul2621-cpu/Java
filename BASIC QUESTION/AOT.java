import java.util.*;
public class AOT {
    public static double area (int a, int b, int c){
        float s = (a+b+c)/2f;
        double ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        return ar;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the values of a,b,c");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            double ar = area(a,b,c);
            System.out.println(ar);
        }
    
}
