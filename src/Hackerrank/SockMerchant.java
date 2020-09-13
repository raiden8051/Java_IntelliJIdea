package Hackerrank;

import java.util.HashSet;

public class SockMerchant {
    public static void main(String[] args) {
        System.out.print(sockMerchant(9,new int[]{10,20,20,10,10,30,50,10,20}));
    }
    static int sockMerchant(int n, int[] ar) {

        int pair = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i:ar){
            if(!hs.add(i)){
                pair++;
                hs.remove(i);
            }
        }
        return pair;
    }
}
