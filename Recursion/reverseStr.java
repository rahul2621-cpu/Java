public class reverseStr {

    public static void rev(String str, int n){
        if(n<0){
            return;
        }
        System.out.print(str.charAt(n));
        rev(str, n-1);
    }

    public static int length(String str){
        if(str.equals("")){
            return 0;
        }
            return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "hello";
        int n = str.length();
        // rev(str, n-1);
        System.out.println(length(str));
    }
}
