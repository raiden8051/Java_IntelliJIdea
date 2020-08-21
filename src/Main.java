import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Main {
    public static int count_a = 0,count_b = 0;

    public static void main(String[] arg) throws IOException {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine().toLowerCase();

        //Coding
        try {
            if(s.indexOf("a")!=-1 && s.indexOf("b")!=-1) {

                if(s.indexOf("a")<s.indexOf("b")){
                    count_a+=s.substring(0,s.indexOf("a")+1).length();
                }
                int index_b = 0, index_a = 0;
                while(s.substring(index_b,index_a)!="-2"){

                    index_b = s.indexOf("b", index_a + 1);
                    index_a = s.indexOf("a", index_b + 1);

                    if(index_a==-1 || index_b==-1)
                        break;
                    if(index_b>index_a) {
                        count_b++;
                        break;
                    }

                    String sub = calculate(s, index_b, index_a);
                    int l = (sub.length()-2)/2;
                    count_a+=l+1;
                    count_b+=l+1;

                }
            }

            //Special Case
            else if (s.indexOf("a") == -1)  //a not present
            {
                count_b++;
            }
            else if (s.indexOf("b") == -1)  //b not present
            {
                count_a++;
            }

            int t_a = 0 , t_b = 0;

            if(s.indexOf("b",s.lastIndexOf("a")+1)>s.lastIndexOf("a"))
            {
                count_b+=s.substring(s.lastIndexOf("b"),s.length()).length();
            }

            t_a = cal_ab(s, 'a')+count_a;
            t_b = cal_ab(s, 'b')+count_b;

            if(t_a==t_b) {
                    System.out.print("Coalition government");
            }
            else if(t_b>t_a){
                    System.out.print("B");
            }
            else if(t_a>t_b) {
                System.out.print("A");
            }
        }
        catch (Exception ex){
        }
    }
    public static String calculate(String s, int index_b, int index_a){
        return s.substring(index_b,index_a+1);
    }
    public static int cal_ab(String s,char ch)
    {
        int a=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==ch)
                a++;
        return a;
    }
}