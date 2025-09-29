public class deletion {
    public static void main(String[] args) {
        int[] original = {10,20,30,40,50};
        int delete = 2;
         int[] arr = new int[original.length-1];
         for(int i=0,j=0;i<original.length;i++){
             if(i==delete){
                 continue;
             }
             arr[j] = original[i];
             j++;
         }

       

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
