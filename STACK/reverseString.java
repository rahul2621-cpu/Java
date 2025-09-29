import java.util.Stack;
public class reverseString {
    public static String rev(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++ ){
            stack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        String output = rev(str);
        System.out.println(output);
    }
    
}
