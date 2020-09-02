package CodingNinja;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DigitsExchanged {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("data.txt")));
        String s;
        ArrayList<String> input = new ArrayList<>();
        while ((s = br.readLine()) != null)
            input.add(s);
        for (int times = 0; times < Integer.parseInt(input.get(0)); times++) {
            ArrayList<Long> al = new ArrayList<>();
            ArrayList<Integer> result = new ArrayList<>();

            String[] arr = input.get(2).split(" ");

            String bits = "";
            int ones = 0, zeros = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < Long.parseLong(arr[i]); j++) {
                    if (i % 2 == 0) {
                        bits += "1";
                        ones++;
                    } else {
                        bits += "0";
                        zeros++;
                    }
                }
            }

            Long decimal = Long.parseLong(bits, 2);
            String binary = "";
            boolean flag = true;
            while (flag) {
                decimal++;
                binary = Long.toBinaryString(decimal);
                int new_ones = countOnes(binary);
                int new_zeros = countZeros(binary);

                if (new_ones == ones && new_zeros == zeros)
                    flag = false;
            }

            if (!flag)
                result = compressBit(binary);
            System.out.println(result.size());

            for (int a : result)
                System.out.print(a + " ");

        }
    }
    public static ArrayList<Integer> compressBit(String binary)
    {
        ArrayList<Integer> al = new ArrayList<>();

        char temp = binary.charAt(0);
        int ctr=1;
        for(int i=0;i<binary.length();i++)
        {
            //(i==0)?binary.charAt(i)==temp:
            if(i!=0)
            {
                if(binary.charAt(i)==temp && binary.charAt(i-1)==temp)
                {
                    ctr++;
                }
                else
                {
                    temp = binary.charAt(i);
                    al.add(ctr);
                    ctr=1;
                }
            }
        }
        al.add(ctr);
        return al;
    }
    public static int countOnes(String s)
    {
        int ctr = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                ctr++;
        }
        return ctr;
    }
    public static int countZeros(String s)
    {
        int ctr = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
                ctr++;
        }
        return ctr;
    }
}