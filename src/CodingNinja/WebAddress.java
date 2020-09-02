package CodingNinja;

import java.util.Scanner;

public class WebAddress {
    public static void main(String[] args){
        sol(new Scanner(System.in).nextLine());
    }
    public static void sol(String str) {
        // Write your code here
        String result="";
        int initial = 0;
        if(str.charAt(initial)=='f'){
            result="ftp://";
            initial = 3;
        }
        else{
            result="http://";
            initial = 4;
        }

        int domain=0;
        domain = str.indexOf("ru");
        result+=str.substring(initial,domain)+".ru/";
        domain+=2;
        result+=str.substring(domain,str.length());

        System.out.println(result);

    }
}
