class power{
   public void pow(int base, int exp){
        int result = 1;
        for(int i=1;i<=exp;i++){
            result *= base;
        }
        System.out.println(result);
    }
}
    public class pow{
    public static void main(String[] args) {
        power p = new power();
        p.pow(2, 5);
    }
}
