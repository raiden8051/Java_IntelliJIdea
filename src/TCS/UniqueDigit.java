package TCS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UniqueDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(getUniqueDigitCount(start,end));
    }
    private static int getUniqueDigitCount(int start, int end)
    {
        int ctr=0;
        for(int i=start;i<=end;i++){
            if(getCount(i))
                ctr++;
        }
        return ctr;
    }
    private static boolean getCount(int i){
        ArrayList<Integer> li = new ArrayList<>();
        while(i>0){
            int t = i%10;
            if(li.contains(t))
                return false;
            else
                li.add(t);
            i/=10;
        }
        return true;
    }
}