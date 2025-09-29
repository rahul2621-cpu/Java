public class palindrome {
    public String pal(String s, String s1){
        for(int i=s.length()-1;i>=0;i--){
            s1 += s.charAt(i);
        }
        if(s.equals(s1)){
            System.out.println("Yes");
        }else{
            System.out.println("Not");
        }
        return s1;
    }

    public static void main(String[] args) {
        palindrome p = new palindrome();
        String se = "madam";
        String sw = "";

        p.pal(se, sw);
    }
}
