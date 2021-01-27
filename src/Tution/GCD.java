package Tution;

import java.util.ArrayList;
import java.util.Collections;

public class GCD {
    public static void main(String[] args) {
        System.out.println(ArrayChallenge(new int[]{2,3,4}));
    }
    public static int ArrayChallenge(int[] arr){
        int total = 0;
        String[] str = new String[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            str[i] = arr[i]+""+arr[i+1];
        }
        for(int i=0;i<str.length-1;i++){
            int n1 = Integer.parseInt(str[i].charAt(0)+"");
            int n2 = Integer.parseInt(str[i+1].charAt(1)+"");
            int n3 = Integer.parseInt(str[i].charAt(1)+"");
            total += n1*n2*n3;
            str[i+1] = n1+""+n2;
        }
        return total;
    }
}
