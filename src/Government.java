import com.sun.jmx.snmp.internal.SnmpSubSystem;

import javax.sound.midi.SysexMessage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Government {
    public static int count_a = 0,count_b = 0;

    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("dataG.txt")));
        String s;

        ArrayList<String> input = new ArrayList<>();
        while ((s = br.readLine()) != null)
            input.add(s);

        s = input.get(1).toLowerCase();

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
                    //System.out.println(sub);
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
            if(count_b==count_a)
                System.out.println("Coalition government");
            else if(count_b>count_a)
                System.out.println("B");
            else
                System.out.println("A");
        }
        catch (Exception ex){
            if(count_b==count_a)
                System.out.println("Coalition government");
            else if(count_b>count_a)
                System.out.println("B");
            else
                System.out.println("A");
            System.out.println("Error");
        }
    }
    public static String calculate(String s, int index_b, int index_a){
        return s.substring(index_b,index_a+1);
    }
}