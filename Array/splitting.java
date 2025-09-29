class spl{
    public int[][] s(int[] o, int n){
        int[] first = new int[n];
        int[] second = new int[o.length-n];

        for(int i=0;i<n;i++){
            first[i] = o[i];
        }
        for(int i=n;i<second.length;i++){
            second[i-n]= o[i];
        }
        return new int[][]{first,second};
    }

    public void print(int[] c){
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}

public class splitting {
    public static void main(String[] args) {
        spl s = new spl();
        int[] orignal = {10,20,30,40,50,60,70};
        int n =3;
        
        int[][] result = s.s(orignal, n);

        System.out.print("First Part");
        s.print(result[0]);

        System.out.print("Second Part");
        s.print(result[1]);

    }
    
}
