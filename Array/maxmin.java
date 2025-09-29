public class maxmin {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5};
        //int max = arr[0];
        // int min = arr[0];

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        //     if(arr[i]<min){
        //         min = arr[i];
        //     }
        // }

        // System.out.println("Maximum:"+max);
        // System.out.println("Minimum:"+min);

    //       int[] arr = {1,2,3,4,5};
    //   int max = Integer.MIN_VALUE;
    //   int secondMax = Integer.MIN_VALUE;
    //   int min = Integer.MAX_VALUE;
    //   int secondMin = Integer.MAX_VALUE;
      
    //   for(int i=0;i<arr.length;i++){
    //     if(arr[i]>max){
    //       secondMax = max;
    //       max = arr[i];
    //     }else if(arr[i]>secondMax && arr[i]!=max){
    //       secondMax = arr[i];
    //     }
        
    //     if(arr[i]<min){
    //       secondMin = min;
    //       min = arr[i];
    //       }else if(arr[i]<secondMin && arr[i]!=min){
    //         secondMin = arr[i];
    //       }
    //   }
    //   System.out.println(secondMax);
    //   System.out.println(secondMin);

    //Second min
        // int min = Integer.MAX_VALUE;
        // int second = Integer.MAX_VALUE;

        // for(int i=0;i<=arr.length-1;i++){
        //     if(arr[i]<min){
        //         second = min;
        //         min = arr[i];
        //     }
        //     else if(arr[i]<second && arr[i]!=min){
        //         second = arr[i];
        //     }
        // }
        // System.out.println(second);



        // Third Max 

        int[] arr = {12,45,1,67,23,90,45};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third = second;
                second = first;
                first = arr[i];
            }else if(arr[i]>second && arr[i]!=first){
                third = second;
                second = arr[i];
            }else if(arr[i]>third && arr[i]!=second && arr[i]!=first){
                third = arr[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


        int fm =Integer.MAX_VALUE;
        int sm = Integer.MAX_VALUE;
        int tm = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<fm){
                tm = sm;
                sm = fm;
                fm = arr[i];
            }else if(arr[i]<sm && arr[i]!=fm){
                tm = sm ;
                sm = arr[i];
            }else if(arr[i]<tm && arr[i]!=sm && arr[i]!=fm){
                tm = arr[i];
            }
        }
        System.out.println(fm);
        System.out.println(sm);
        System.out.println(tm);
    }
    
}
