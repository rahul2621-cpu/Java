import java.util.*;
class Vowel{

    public boolean isVowel(char ch){
       return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public String process(String str){
        String S = "";
        int i = 0;

        while(i<str.length()){
            char ch = str.charAt(i);

            if(isVowel(ch)){

                if(i+1<str.length() && isVowel(str.charAt(i+1))){
                    while(i<str.length() && isVowel(str.charAt(i))){
                        S += str.charAt(i);
                        i++;
                    }
                }else{
                    i++;
                }
            }else{
                S += ch;
                i++;
            }
        }
        return S;
    }   
}

public class intime {
    public static void main(String[] args) {
        Vowel v = new Vowel();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();

        String str = v.process(s);
        System.out.println(str);
    }
}
