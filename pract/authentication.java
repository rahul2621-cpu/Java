import java.util.Scanner;

public class authentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username,password;
        System.out.print("Enter the username:");
        username = sc.nextLine();
        System.out.print("Enter the password:");
        password = sc.nextLine();

        if(username.equals("rahul") && password.equals("1234")){
            System.out.println("Authentication succesfull");
        }
        else{
            System.out.println("Authentication not done");
        }

    }
}
