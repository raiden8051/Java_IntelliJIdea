package CodingNinja;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        System.out.println(getCompressedString(new Scanner(System.in).nextLine()));
    }
    public static String getCompressedString(String input) {
        //Your code goes here.
        char ch;
        String result="";
        int ctr=1;
        ch = input.charAt(0);
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==ch){
                ctr++;
            }
            else{
                result+=ch+"";
                if(ctr>1)
                    result+=ctr;
                ctr=1;
                ch = input.charAt(i);
            }
        }
        result+=ch+"";
        if(ctr>1)
            result+=ctr;
        return result;
    }
}
