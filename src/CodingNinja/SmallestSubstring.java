package CodingNinja;

public class SmallestSubstring {
    public static void main(String[] args) {
        String large = "Looks for minimum string";
        String small = "mums";
        int len = large.length()-small.length()-1;
        for(int i=0;i<len;i++) {
            String sub = large.substring(i, i+small.length()+1);
            String sub2 = sub.replace(" ", "");
            if (sub2.contains(small))
                System.out.println(sub);
        }
    }
}
