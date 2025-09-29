
import java.util.*;

public class rotating {

public static void rotate(int[] arr, int k){
    int n = arr.length;
    k = k%n;

    int[] temp = new int[n];

    for(int i=0;i<n;i++){
        temp[(i+k)%n] = arr[i];

    }
    System.arraycopy(temp, 0, arr, 0 ,n);
}    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k =2;
        System.out.println(Arrays.toString(arr));
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
