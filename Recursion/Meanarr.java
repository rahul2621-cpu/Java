public class Meanarr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        double me = mean(arr,n); 
        System.out.println(me);
    }

    public static int sum(int[] arr, int i){
        if(i==0){
            return arr[0];
        }
        return arr[i] + sum(arr,i-1);
    }

    public static double mean(int[] arr,int n){
        int su = sum(arr,n-1);
        return (double) su/n;
    }
}
