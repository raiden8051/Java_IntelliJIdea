package Tution;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
       System.out.println(ArrayChallenge(new int[]{8,2,1,4,10,5,-1,-1}));
    }
    public static String ArrayChallenge(int[] arr){
        int ctr = 0;
        for(int i=1;i<arr.length-3;i++)
        {
            for(int j=i+1;j<arr.length-3;j++)
            {
                for(int k=j+1;k<arr.length-3;k++)
                {
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum==arr[0])
                        return "true";
                }
            }
        }
        return "false";
    }
}
