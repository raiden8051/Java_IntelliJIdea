import java.util.Scanner;

public class coding1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ctr=0;
        char ch;
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(temp.indexOf(s.charAt(i))!=-1)
                continue;
            else {
                int min = 0, max = 0;
                ch = s.charAt(i);
                if (s.lastIndexOf(ch ) != -1) {
                    min = s.indexOf(ch);
                    max = s.lastIndexOf(ch);
                    if (ctr < max - min) {
                        ctr = max - min;
                    }
                    temp += ch;
                }
            }
        }
        if(ctr==0)
            System.out.println(-1);
        else
            System.out.println(ctr-1);
    }
}
