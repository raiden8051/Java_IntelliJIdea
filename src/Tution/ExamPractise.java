package Tution;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;

public class ExamPractise {
    public static void main(String[] args)throws IOException {
//        int a = 10;
//        float b;
//        b = a;
//        System.out.println("Implementation of Implicit Type Conversion");
//        System.out.println("A(Integer) : "+a);
//        System.out.println("B(Float) : "+b);

//        double a = 13.5;
//        float b;// = 13.5f;
//        b = (float)a;
//        System.out.println("Implementation of Explicit Type Conversion");
//        System.out.println("A(Integer) : "+a);
//        System.out.println("B(Float) : "+b);

//        String ch = "334754f8";
//        int a = 0;
//        a = Integer.parseInt(ch);
//        System.out.println(a);

//        DataInputStream di = new DataInputStream(System.in);
//
//        String s = di.readLine();
//        System.out.println(s);
//        int a = Integer.parseInt(di.readLine());
//        System.out.println(a);
//        ASCII - 256 (0 - 255) Л '/u0000 - /uFFFF'
        /*
        0 - F => 0 - 15 => 10-A, 11-B, 12-C, 13-D, 14-E, 15-F
        0041(hexadecimal) - decimal
         */
//        Integer[] arr = new Integer[]{4,2,5,3,1};
//        List<Integer> li = new ArrayList<>();
//        Arrays.sort(arr);
//        Collections.sort(li,Collections.reverseOrder());
//        for(int i:arr)
//            System.out.println(i);
//        System.out.println(10+10+'A');
//        char ch = 'a';
//        System.out.println((int)ch++);
//        System.out.println((int)++ch);
//        int a = 1;
//        switch(a){
//            case 1: case 2: case 3:System.out.println("hello");break;

        int a=10,b=10;
//        System.out.println(!(a>b)); // True
//        System.out.println(a<b); // False
//
//        System.out.println(a>=b); // True
//        System.out.println(a<=b); // True
//
//        System.out.println(!false || !false);
//
//        System.out.println(5/10);

        int d = 10;// Assignment Op
        System.out.println(a==b);

        a=a+b;
        a+=b; // += Shorthand Op

        // &&(And) -> Ampersand => t-t=t only
        /*
            t-t = t
            t-f = f
            f-t = f
            f-f = f
        */
        // ||(Or) -> Pipe  => f-f=f only
        /*
            t-t = t
            t-f = t
            f-t = t
            f-f = f
        */
        // !(Not) -> Exclamation=> f-t, t-f

        }
    }
