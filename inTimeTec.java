import java.util.Scanner;

// Class that contains the logic
class VowelProcessor {

    // Function to process the string according to the given rule
    public String processString(String str) {
        String result = ""; // To store final result
        int i = 0;

        while (i < str.length()) {
            char current = str.charAt(i);

            // If current is a vowel
            if (isVowel(current)) {

                // Check if next character is also a vowel
                if (i + 1 < str.length() && isVowel(str.charAt(i + 1))) {
                    // Keep all vowels in the sequence
                    while (i < str.length() && isVowel(str.charAt(i))) {
                        result += str.charAt(i);
                        i++;
                    }
                } else {
                    // Single vowel → skip
                    i++;
                }
            } else {
                // Not a vowel → keep
                result += current;
                i++;
            }
        }

        return result;
    }

    // Function to check vowel
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}

// Main class
public class inTimeTec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VowelProcessor vp = new VowelProcessor();

        System.out.print("Enter a string: ");
        String input = sc.nextLine(); // Take user input

        String processed = vp.processString(input);
        System.out.println("Processed String: " + processed);
    }
}

