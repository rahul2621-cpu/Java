import java.util.*;
public class removespecialcharacter {
    public static void main(String[] args) {
        String s = "a!B@C#1$2%3";
        System.out.println(s.replaceAll("[^a-z A-Z 0-9]",""));

    }
}
