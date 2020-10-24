package Hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CycleShift {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, n, k, ctr;
        String str, temp = "";

        t = Integer.parseInt(br.readLine());
        while(t-->0){

            ctr = 0;
            String[] data = br.readLine().split(" ");
            n = Integer.parseInt(data[0]);
            k = Integer.parseInt(data[1]);

            str = br.readLine();
            temp = str;
            while(true){
                temp = temp.charAt(n-1)+temp.substring
                        (0,n-1);
                ctr++;
                if(temp.equals(str))
                    break;
            }
            System.out.println((ctr*k)-1);
        }
    }
}