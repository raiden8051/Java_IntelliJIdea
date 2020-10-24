/* Do not add a package declaration */
import java.util.*;
import java.io.*;
public class Xor2 {
    /* Save this in a file called Main.java to compile and test it */
/* You may add any imports here, if you wish, but only from the
   standard library */
    public static int processArray(ArrayList<Integer> array) {

    ArrayList<Integer> dataArray = new ArrayList<>();
    int ctr = 0;
    for(int i=0;i<array.size();i++){
        if(array.get(i)%2==1){
            dataArray.add(array.get(i));
        }
        else{
            if(dataArray.size()>0)
                ctr+=getOddData(dataArray);
            dataArray.clear();
            }
        }
        if(dataArray.size()>0)
            ctr+=getOddData(dataArray);

        return ctr;
    }
    public static int getOddData(ArrayList<Integer> array)
    {
        for(int i=0;i<array.size();i++){
            if(array.get(i)>10) {
                return 1;
            }
        }
        return 0;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}
