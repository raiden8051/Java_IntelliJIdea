package Hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesignerPdfViewer {

    static void designerPdfViewer(int[] h, String word) {

        Map<Character, Integer> mapKey = new HashMap<>();
        char myChar = 'a';
        String alreadyChecked = "";
        int max=0;
        for(int i=0;i<26;i++){
            mapKey.put(myChar++,h[i]);
        }
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(alreadyChecked.indexOf(ch)!=-1)
                continue;
            else {
                int v = mapKey.get(ch);
                if (v > max)
                    max = v;
                alreadyChecked += ch;
            }
        }
        System.out.println(max*word.length());
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        designerPdfViewer(h, word);
        scanner.close();
    }
}
