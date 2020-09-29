package Hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EcryptionMedium {
    static String encryption(String s) {

        String result = "";
        int row = 0, column = 0;
        s = s.trim().replace(" ","");
        int l = s.length();

        double d = Math.sqrt(l);
        row = (int)d;

        if(d-row==0)
            column=row;
        else
            column = row+1;
        if(row*column<l) {
            row++;
        }
        for(int i=0;i<column;i++)
        {
            for(int j=i;j<l;j+=column) {
                if(j<l)
                    result+=s.charAt(j);
            }
            result+=" ";
        }
        return result.trim();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String result = encryption(s);

        System.out.println(result);

        scanner.close();
    }
}
