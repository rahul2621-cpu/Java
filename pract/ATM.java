import java.util.*;
public class ATM {
    public static void main(String[] args) {
        int balance = 5000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");     
            
            int n= sc.nextInt();
            switch (n) {
                case 1 :
                    System.out.println("Enter the amount to be withdraw");
                    withdraw = sc.nextInt();
                    if(balance>=withdraw){
                        balance = balance-withdraw;
                        System.out.println("Please collect your money");
                    }else{
                        System.out.println("Insufficient amount");
                    }
                    System.out.println("");
                    break;
                
                    case 2:
                    System.out.println("Enter the amount to be deposite");
                    deposit = sc.nextInt();
                    balance = balance+deposit;
                    System.out.println("Your Money ");
                    System.out.println();
                    break;

                    case 3:
                    System.out.println("Balance"+balance);
                    System.out.println("");
                    break;

                    case 4:
                    System.out.println("Thank you for using ATM");
                    System.exit(0);

                    
            }
        }}
    }


