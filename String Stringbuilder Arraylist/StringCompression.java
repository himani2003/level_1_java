// 2. You have to compress the given string in the following two ways - 
//    First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//    For "aaabbccdee", the compressed string will be "abcde".
//    Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//    For "aaabbccdee", the compressed string will be "a3b2c2de2".

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        first(str);
        second(str);
    }

    public static void first(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 1));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static void second(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 1));
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                if (count != 1) {
                    sb.append(count);
                }
                sb.append(str.charAt(i));
                count = 1;
            } else {
                count++;
            }
        }
        if (count != 1) {
            sb.append(count);
        }
        System.out.println(sb);
    }
}
