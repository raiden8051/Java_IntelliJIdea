package Hackerrank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        List<BigDecimal> li = new ArrayList<>();
        for (String ar : s)
            li.add(new BigDecimal(ar));

        for (BigDecimal bd : li)
            System.out.println(bd);

    }
}
