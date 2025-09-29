class bankAccount{
    private String accountnumber;
    private double balance;

    public bankAccount(String accountNum, double bala){
        this.accountnumber = accountNum;
        this.balance = bala;
    }

    public String getNo(){
        return accountnumber;
    }

    public double getbala(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.println(amount);
        }else{
            System.out.println("invalid");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println(amount);
        }else{
            System.out.println("Invalid");
        }
    }
}

    public class enacapsulation{
        public static void main(String[] args) {
            bankAccount bc = new bankAccount("12345", 5000.0);
            System.out.println("Account Number"+bc.getNo());
            System.out.println("Balance"+ bc.getbala());

            bc.deposit(1500.0);
            System.out.println("Balance"+ bc.getbala());

            bc.withdraw(2000.0);
             System.out.println("Balance"+ bc.getbala());

        }
    }
