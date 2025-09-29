import java.util.Arrays;

public class zNDone{
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,0,0,0,0,0};
        int n = arr.length;

        int j =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[j++] = arr[i];
            }
        }
        while(j<arr.length){
            arr[j+1] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}