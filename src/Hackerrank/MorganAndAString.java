package Hackerrank;
import java.io.*;
import java.util.*;

public class MorganAndAString {


    // Complete the morganAndString function below.
    static String morganAndString(String a, String b) {

        int a_ctr = 0, b_ctr = 0, i = 0;
        String ach, bch;
        StringBuilder result = new StringBuilder();
        StringBuilder asb = new StringBuilder(a);
        StringBuilder bsb = new StringBuilder(b);
        while(i++<a.length()+b.length()){
            try {
                ach = Character.toString(asb.charAt(0));
                bch = Character.toString(bsb.charAt(0));
                if (ach.compareTo(bch) < 0 || ach.compareTo(bch) == 0) {
                    result.append(ach);
                    asb.deleteCharAt(0);
                } else {
                    result.append(bch);
                    bsb.deleteCharAt(0);
                }
            }
            catch (StringIndexOutOfBoundsException ex) {
                if(asb.length()==0)
                    result.append(bsb);
                else
                    result.append(asb);
                break;
            }
        }
        return result.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = morganAndString(a, b);

            System.out.println(result);
        }

        scanner.close();
    }

}
