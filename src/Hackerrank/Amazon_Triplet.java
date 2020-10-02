package Hackerrank;
import java.util.*;
public class Amazon_Triplet {

        static List<String> li = new ArrayList<>();
        public static void main(String args[] ) throws Exception {

            Scanner sc = new Scanner(System.in);
            //int n = sc.nextInt();
                int n;
                n=sc.nextInt();

            sc.nextLine();

            String[] s = sc.nextLine().split(" ");

            String[] d = new String[3];

            getData(s,d,0,n-1,0,3);

            System.out.println(li.size());

        }
        static void getData(String[] arr,String[] d,int s, int e, int index, int triplet){
            if(index==triplet){
                if(Integer.parseInt(d[0])<Integer.parseInt(d[1]) && Integer.parseInt(d[1])>Integer.parseInt(d[2]))
                    li.add(d[0]+""+d[1]+""+d[2]);
            }
            for(int i=s;i<=e && e-(i+1) >=triplet-index;i++){
                d[index] = arr[i];
                getData(arr,d,i+1,e,index+1,triplet);
            }
        }
    }
