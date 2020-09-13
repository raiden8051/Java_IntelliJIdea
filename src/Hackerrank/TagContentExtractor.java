package Hackerrank;

import java.util.Stack;

public class TagContentExtractor {
    public static void main(String[] args) {
        String li = "<h1><h1>Sanjay has no watch</h1></h1>";

        Stack<String> st = new Stack<>();
        if(li.charAt(0)=='<') {
            String startTag = li.substring(1, li.indexOf(">"));
            String endTag = li.substring(li.indexOf("/")+1,li.indexOf("/")+li.indexOf(">"));
            if(startTag.equals(endTag))
                System.out.println(li.substring(li.indexOf(">")+1,li.indexOf("/")-1));
        }
    }
}
