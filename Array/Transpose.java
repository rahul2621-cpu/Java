import java.util.Scanner;
public class Transpose{

    public static void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Using same array
    public static int[][] transpose(int[][] matrix , int r , int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }


    //Using extra array
    // public static int[][] transpose(int[][] matrix,int r, int c){
    //     int[][] ans = new int[c][r];

    //     for(int i=0;i<c;i++){
    //         for(int j=0;j<r;j++){
    //             ans[i][j] = matrix[j][i];
    //         }
    //     }
    //     return ans;
    // }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalelement = r*c;
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // System.out.println("Input Matrix:");
        // print(matrix);

        System.out.println("Transpose Matrix");
        // int[][] ans = transpose(matrix,r,c);
        // print(ans);

        transpose(matrix, r, c);
        print(matrix);
        
    }
}