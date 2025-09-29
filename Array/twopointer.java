public class twopointer{
    public static void main(String[] args) {
         int[] arr = {10,20,30,40,50};
         int target = 70;

    //     int left = 0, right = arr.length-1;

    //     while(left<right){
    //         int sum = arr[left]+arr[right];
    //         if(sum == target){
    //             System.out.println("Found" + arr[left] + " , " +arr[right]);
    //             break;
    //         }else if(sum<target){
    //         left++;
    //     }else{
    //         right--;
    //     }
    // }}
            for(int i=0;i<arr.length;i++){
                for(int j=i+1; j<arr.length;j++){
                    if(arr[i]+arr[j]==target){
                        System.out.println("found" +i+","+j);
                    }
                }
            }
    }
}