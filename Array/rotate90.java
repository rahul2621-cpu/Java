import java.util.Scanner;
public class rotate90 {
public static void print(int[][] arr){
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
}

public static void transpose(int[][] arr,int r,int c){
    for(int i=0;i<r;i++){
        for(int j=i;j<c;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }
}

public static void reverse(int[] arr){
    int i=0,j=arr.length-1;
    while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}

public static void rotate(int[][] arr,int n){
    transpose(arr, n, n);
    for(int i=0;i<n;i++){
        reverse(arr[i]);       
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows ans columns");
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] matrix = new int[r][c];
    int total = r*c;
    System.out.println("Enter the "+total+ " elements");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            matrix[i][j] = sc.nextInt();
        }
        System.out.println();
    }
    rotate(matrix, c);
    print(matrix);
}
}
