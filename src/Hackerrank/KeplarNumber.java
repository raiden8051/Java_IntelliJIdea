package Hackerrank;

import java.util.Scanner;

public class KeplarNumber {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {

        int sq = 0;
        int len=0;
        int num1=0,num2=0;
        String sb = "";
        for(int i=p;i<=q;i++){
            sb="";
            sq = i*i;
            sb += sq;
            len = sb.length()/(i+"").length();
            num1 = Integer.parseInt(sb.substring(0,len-1));
            num2 = Integer.parseInt(sb.substring(len-1));
            if(num1+num2==i)
                System.out.print(i+" ");

        }
        /*

        */
    }
    static int digits(int n){
        int c = 0;
        while(n>0){
            n/=10;
            c++;
        }
        return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
