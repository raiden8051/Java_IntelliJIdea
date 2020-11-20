import java.util.Scanner;

public class baseball {
    public static String ArrayChallenge(String[] strArr) {
        // code goes here

        int ctr = 0;
        String data = strArr[0], result = "";
        String[] arr = new String[strArr.length-1];
        for(int i=1;i<strArr.length;i++)
            arr[ctr++] = strArr[i];

        for(int i=0;i<data.length();i++){
            String s1 = data.substring(0,i);
            String s2 = data.substring(i+1);

            if(bSearch(arr,s1)!=-1 && bSearch(arr,s2)!=-1){
                result=s1+","+s2;
            }
        }

        return result.equals("")?"not possible":result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ArrayChallenge(s.nextLine().split(",")));
    }

    public static int bSearch(String[] arr, String data){
        int l = 0, r = arr.length-1;
        while(l<=r){
            int m = l+(r-1)/2;
            int index = data.compareTo(arr[m]);
            if(index == 0)
                return m;
            if(index>0)
                l=m+1;
            else
                r = m-1;
        }
        return -1;
    }
}
