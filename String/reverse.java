public class reverse {

    public String rev(StringBuffer s){
        return s.reverse().toString();

        }
    public static void main(String[] args) {
       
        String str = "Hello";
        String str1 = "";
        for(int i=str.length()-1;i>=0;i--){
            str1 += str.charAt(i);
        }
        System.out.println(str1);
        
        reverse c = new reverse();
        StringBuffer sb = new StringBuffer(str);
        String reve = c.rev(sb);
        System.out.println(reve); 
    }
}
