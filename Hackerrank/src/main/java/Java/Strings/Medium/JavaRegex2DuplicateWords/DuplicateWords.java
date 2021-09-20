package Java.Strings.Medium.JavaRegex2DuplicateWords;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DuplicateWords {
    public static void main(String[] args) {

        /* Write a RegEx matching repeated words here. */
        String regex = "(\\b\\w+\\b)(\\s*\\b\\1\\b)*";
        /* Insert the correct Pattern flag here.*/
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            while (m.find()) {
                /* The regex to replace The replacement. */
                input = input.replaceAll(m.group(0),m.group(1));
            }

            System.out.println(input);
        }
        in.close();
    }
}
