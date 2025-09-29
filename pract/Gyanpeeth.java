abstract class Bank{
    abstract void deposit(User user, double amount);
    abstract void withdraw(User user, double amount);
    abstract void checkBalance(User user);
}

class MyBank extends Bank{
    void deposit(User user, double amount){
        user.setBalance(user.getBalance()+amount);
        System.out.println(amount+" : Deposited");
    }

    void withdraw(User user, double amount){
        if(user.getBalance()>=amount){
            user.setBalance(user.getBalance()-amount);
            System.out.println(amount+" : Withdraw");
        }else{
            System.out.println("Insufficient balance");
        }
    }
    void checkBalance(User user){
        System.out.println(user.getName()+" : " + user.getBalance());
    }

}
class User{
    private String name;
    private String accountNumber;
    private double balance;
    
    public User(String name, String accountNumber, double amount){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = amount;
    }

    public String getName(){
        return name;
    }

    public String getaccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}

class ATM{
    private User user;
    private Bank bank;

    public ATM(User user, Bank bank){
        this.user = user;
        this.bank = bank;
    }

    public void deposit(double amount){
        bank.deposit(user, amount);
    }

    public void withdraw(double amount){
        bank.withdraw(user, amount);
    }

    public void checkBalance(){
        bank.checkBalance(user);
    }
}
public class Gyanpeeth {
    public static void main(String[] args) {
    User user1 = new User("Rahul", "12345", 5000.0);
    Bank bank = new MyBank();
    ATM atm = new ATM(user1, bank);

    atm.checkBalance();
    atm.deposit(2000);
    atm.withdraw(3000);
    atm.checkBalance();

}
}
