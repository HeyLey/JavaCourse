package Week2;


import java.io.IOException;

/**
 * Created by leyla on 22/09/15.
 */
public class Ex2 {
    public static void main(String[] args) throws IOException {

        String text = "56Madam, I'm Adam!65";
        System.out.print(isPalindrome(text));

    }

    public static boolean isPalindrome(String text) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c)) {
                sb.append(c);
            }
        }
        String str = new String(sb);
        StringBuilder s =  sb.reverse();
        String st = new String(s);

        System.out.println(st);
        System.out.println(str);
        return (str.equalsIgnoreCase(st));
    }
}
