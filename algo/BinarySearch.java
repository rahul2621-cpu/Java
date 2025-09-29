import java.util.*;
class binary{
    public static int bin(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==key){
                System.out.println("Element is found at index: "+mid);
                break;
            }else if(arr[mid]<key){
                low = mid+1;
            }else{
                high = mid-1;
            }
            
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        binary bi = new binary();
         int[] arr = {10,20,30,40,50,60};
         System.out.println("Enter the key ");
         int key = sc.nextInt();
         bi.bin(arr, key);
       
        
    }
}
