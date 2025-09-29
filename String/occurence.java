public class occurence {
    public static void main(String[] args) {
        String str = "banana";
        String st = "";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(st.indexOf(ch) != -1){
                continue;
            }

            int count = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            System.out.println(ch+ " => "+ count);
            st += ch;
        }     
    }
}
