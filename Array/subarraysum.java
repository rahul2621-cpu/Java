class subarraysum{
    public static void main(String[] args){
        int[] arr = {1,2,-100,4,5};

        int maxsum = arr[0];
        int current = arr[0];

        int start = 0;
        int end = 0;
        int tempstart = 0;

        for(int i=1;i<arr.length;i++){
            if(current<0){
                current = arr[i];
                tempstart = i;
            }else{
                current += arr[i];
            }

            if(current > maxsum){
                maxsum = current;
                start = tempstart;
                end = i;
            }
        }
        System.out.println("Maximum subarray is: "+maxsum);
        System.out.println("Subarray is:");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}