class copy{
    public int[] cop(int []arr){
        int arr1[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
          return arr1; 
    }

    public void print(int arr1[]){
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }

}
public class copying {
    public static void main(String[] args) {
        copy c = new copy();
        int ar[]={1,2,3,4,5};
        int br[] =c.cop(ar);
                
        c.print(br);
    }
}
