class insertin{
    public int[] insert(int[] original,int ele, int ind){
        int newA[] = new int[original.length+1]; 
        for(int i=0,j=0;i<newA.length;i++){
            if(i==ind){
                newA[i]=ele;
            }else{
                newA[i] = original[j];
                    j++;
            }
        }
        return newA;
    }

    public void print(int newA[]){
        for(int i=0;i<newA.length;i++){
            System.out.print(newA[i]+" ");
        }
    }

}
public class inserting {
    public static void main(String[] args) {
        insertin a = new insertin();
        int arr[] = {1,2,3,5};
        int q = 4;
        int s = 3;
        int arr1[] = a.insert(arr, q, s);
        
        a.print(arr1);
    }
}
