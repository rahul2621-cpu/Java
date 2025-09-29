public class AP {
    public int ap(int a, int d, int n){
        int term=a;
        for(int i=0;i<n;i++){
            System.out.print(term+",");
            term = term+d;
        }
        return term;
    }
    public static void main(String[] args) {
        int a = 3;
        int d = 5;
        int n = 10;

        AP ii= new AP();
        int result = ii.ap(a, d, n);
        System.out.println(result);

    }
}
