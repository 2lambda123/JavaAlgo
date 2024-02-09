package com.thealgorithms.others;

import io.github.pixee.security.BoundedLineReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Varun Upadhyay (https://github.com/varunu28)
 */
public class RemoveDuplicateFromString {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String inpStr = BoundedLineReader.readLine(br, 5_000_000);

        System.out.println("Actual string is: " + inpStr);
        System.out.println(
            "String after removing duplicates: " + removeDuplicate(inpStr)
        );

        br.close();
    }

    /**
     * This method produces a string after removing all the duplicate characters
     * from input string and returns it Example: Input String - "aabbbccccddddd"
     * Output String - "abcd"
     *
     * @param s String from which duplicate characters have to be removed
     * @return string with only unique characters
     */
    public static String removeDuplicate(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (sb.toString().indexOf(s.charAt(i)) == -1) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
