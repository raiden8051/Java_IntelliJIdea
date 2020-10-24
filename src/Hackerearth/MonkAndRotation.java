package Hackerearth;
import java.util.*;
public class MonkAndRotation {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int t,n,k,sub=0;
        t = sc.nextInt();
        while(t-->0)
        {
            n = sc.nextInt();
            k = sc.nextInt();
            sc.nextLine();
            String[] arr = sc.nextLine().split(" ");
            if(k>n)
                k %= n;

            sub = n - k;
            for(int i=sub;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<sub;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
