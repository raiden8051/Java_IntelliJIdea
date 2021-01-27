package TCS;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();//4
        int end = sc.nextInt();//30
        System.out.println(a(b(start,end)));
    }
    private static int a(ArrayList<Integer> li){
        int ctr=0;
        for(int i=0;i<li.size();i++){
            for(int j=i+1;j<li.size();j++){
                if(li.get(j)-li.get(i)==6){
                    ctr++;
                    break;
                }
                else if(li.get(j)-li.get(i)>6)
                    break;
            }
        }
        return ctr;
    }
    private static ArrayList<Integer> b(int start,int end){
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=start;i<=end;i++){
            if(c(i))
                li.add(i);
        }
        return li;
    }
    private static boolean c(int n){
        int ctr=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                ctr++;
            if(ctr>2)
                break;
        }
        return ctr==2;
    }
}
