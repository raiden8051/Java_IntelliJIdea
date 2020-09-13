package Hackerrank;

import java.util.*;

public class JavaSubstringLexi {

    public static void main(String[] args) {
        final String input = new String("Alphabet");
        String output = new String();
        int n = 4;
        SortedSet<String> st = new TreeSet<>();
        List<Integer> m = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<=input.length()-n;i++) {
            String sub = input.substring(i, i + n);
            st.add(sub);
            m.add(getCharSum(sub));
        }
        Collections.sort(m);
    }
    public static int getCharSum(String sub){
        int sum = 0;
        for(int i=0;i<sub.length();i++){
            sum+=sub.charAt(i);
        }
        return sum;
    }
}
