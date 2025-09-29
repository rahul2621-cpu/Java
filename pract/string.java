class Str{
    public static String reverse(String str, String str2){
        str = str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            str2 += str.charAt(i);       
        }
        return str2;
    }

    public static String palindrome(String str, String str1){
        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        str1 = reverse(str, str1);
        if(str.equals(str1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        return str1;
        }

    }

public class string {
    public static void main(String[] args) {
        Str s = new Str();
        String str = "madam";
        String str1 = "";
        
        System.out.println(s.reverse(str, str1));

        System.out.println(s.palindrome(str, str1));

    }
}