import java.util.*;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[][] arr = new int[3][4];
        
         // int sum = 0;
        // int max = Integer.MIN_VALUE;
        // int[][] arr = {{1,2,3,4},{5,6,7,8},{4,5,6,7}};

        System.out.println("Enter the element : ");
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
            //System.out.println();
        }

        for(int j=0;j<arr[0].length;j++){
        for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+ " ");
            }
                System.out.println();
        }
    // WAP TO FIND MAX OF AN 2D ARRAY
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //        if(arr[i][j]>max){
        //         max = arr[i][j];
        //        }
        //        
        //         //System.out.print(arr[i][j]+" ");
        //     }
        //     //System.out.println();
        // }


        // WAP TO FIND SUM OF AN EACH ROW AND RETURN MAX SUM AND ROW NO.
    //     int row = -1;
    //      for(int i=0;i<arr.length;i++){
    //         int su = 0;
    //         for(int j=0;j<arr[0].length;j++){
    //             su += arr[i][j];
    //         }
    //        if(su>max){
    //         max = su;
    //         row = i;
    //        }
    // }
    // System.out.println(max+"  "+row);


    // int min = Integer.MAX_VALUE;
    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[0].length;j++){
    //         if(arr[i][j]<min){
    //             min = arr[i][j];
    //         }
    //     }
    // }
    // System.out.println(min);
}
}
