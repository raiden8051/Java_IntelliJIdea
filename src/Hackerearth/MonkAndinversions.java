package Hackerearth;

import java.io.*;
import java.util.Arrays;

public class MonkAndinversions {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t,n = 0;
        int[][] arr;
        String[][] data;
        t = Integer.parseInt(br.readLine());
        while(t-->0) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];

            data = new String[n][n];
            for (int i = 0; i < n; i++)
                data[i] = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    arr[i][j] = Integer.parseInt(data[i][j]);
            }
            int ctr = 0;
            //Implementation
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = i; k < n; k++) {
                        for (int m = j; m < n; m++) {
                            if (arr[i][j] > arr[k][m])
                                ctr++;
                        }
                    }
                }
            }
            System.out.println(ctr);
        }
    }
}
