package Hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] arr = s.split("[^A-Za-z]");
        for(String a:arr) {
        if (!a.equals(""))
            System.out.println(a);
        }
        scan.close();
    }
}
