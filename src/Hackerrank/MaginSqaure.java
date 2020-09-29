package Hackerrank;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaginSqaure {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        List<Integer> li = new ArrayList<>();
        int cost = 0, max = 0, total = 0, row = 0, col = 0, d1 = 0, d2 = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                total+=s[i][j];
                col+=s[i][j];
                row+=s[j][i];
                if(i==j)
                    d1+=s[i][j];
                if(i+j==2)
                    d2+=s[i][j];
            }
            li.add(row);
            li.add(col);
            col = 0;
            row = 0;
        }
        li.add(d1);
        li.add(d2);
        System.out.println(li);
        for(int i:li)
            cost+=i;
        return cost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        System.out.println(result);

        scanner.close();
    }
}
