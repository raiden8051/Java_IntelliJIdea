package Hackerrank;

public class RepeatedString {
    public static void main(String[] args) {
        String s = "ababa";
        //String a = "bcbccacaacbbacabcabccacbccbababbbbabcccbbcbcaccababccbcbcaabbbaabbcaabbb";
        long n;
        n = 3l;
        long count_a = 0;
        int len = s.length();
        if(len == 1 && s.charAt(0)=='a')
            System.out.print(n);
        else{
            count_a = countA(s);
                int rem = (int)(n % len);
                long multiplier = n/len;
                count_a *= multiplier;
                int extra_count = countA(s.substring(0,rem));
                count_a+=extra_count;
        }
        System.out.print(count_a);

    }
    public static int countA(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')
                count++;
        }
        return count;
    }
}
