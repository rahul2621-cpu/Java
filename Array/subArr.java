public class subArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Access(arr);
    //    int result= Sum(arr);
    //    System.out.println(result);
    Average(arr);
    }

    public static void Access(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
}

public static int Sum(int[] arr){
    int max = arr[0];
    int cur = arr[0];

    for(int i=1;i<arr.length;i++){
        if(arr[i]>cur+arr[i]){
            cur = arr[i];
        }else{
            cur = cur+arr[i];
        }
        if(cur>max){
            max=cur;
        }
    }
    return max;
}

public static void Average(int[] arr){
    double max = Double.NEGATIVE_INFINITY;
    int start = 0, end = 0;

    for(int i=0;i<arr.length;i++){
        int sum = 0;
        for(int j=i;j<arr.length;j++){
            sum +=sum+arr[j];
            int length = j-i+1;
            double average = (double)sum/length;

            if(average>max){
                max=average;
                start= i;
                end = j;
            }

        }
    }
    System.out.println("Max Average "+ max+ " from subarray ");
    for(int i=start;i<=end;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
}