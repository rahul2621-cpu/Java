import java.util.Scanner;
public class XylemPhloem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        int temp = Math.abs(num);

        if(temp<10){
            System.out.println("Neither Xylem or nor Phloem");
            return;
        }

        int last = temp%10;
        temp /= 10;

        int mean = 0;
        while(temp>9){
            mean += temp%10;
            temp /= 10;
        }

        int first = temp;
        int ex = first+last;

        if(ex == mean){
            System.out.println("Its an Xylem");
        }else{
            System.out.println("Its an Phloem");
        }
    }
}