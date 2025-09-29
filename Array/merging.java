class m{
    public int[] arr(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i] = a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i] = b[i];
                }
                return c;
    }

    public void print(int[] c){
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}

public class merging {
    public static void main(String[] args) {
        m me = new m();
        int[] z = {1,2,3};
        int[] d = {4,5,6};
        int[] g = me.arr(z, d);
        me.print(g);
    }
}
