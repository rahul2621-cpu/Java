import java.util.*;
public class Transpose{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the element: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<arr[0].length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        System.out.println();
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}