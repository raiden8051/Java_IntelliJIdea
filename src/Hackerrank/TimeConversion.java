package Hackerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class TimeConversion {

        /*
         * Complete the timeConversion function below.
         */
        static void timeConversion() {
            /*
             * Write your code here.
             */
//            Integer[] a = new Integer[]{1,2,3,4};
//            List<Integer> li = Arrays.asList(a);
//            li.stream().map(w->w+1).collect(Collectors.toList());
//            String output="";
//            int in;
//            int len=s.length();
//
//            in=Integer.parseInt(s.substring(0,2));
//            if(in==12 && s.substring(len-2,len).equals("AM"))
//            {
//                output+="00";
//            }
//            else if(in==12 && s.substring(len-2,len).equals("PM"))
//            {
//                output+=in;
//            }
//            else if(s.substring(len-2,len).equals("AM"))
//            {
//                output+="0"+in;
//            }
//            else
//            {
//                in=in+12;
//                output+=in;
//            }
//            return output+s.substring(2,len-2);
        }
        //output 06 aana chahiye tmhara bs 6 aara

        private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            timeConversion();
        }
    }
    //jb am rhega tb add ni krna bs pm mein add hota