import java.util.*;

public class StringSwap {
    public static void main(String[] args) {
        String s = "raiden";
        System.out.print(s.charAt(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0));
        ArrayList<String> li = new ArrayList<String>();
        li.add("aa");
        li.add("bb");
        li.forEach(System.out::println);
    }

}
