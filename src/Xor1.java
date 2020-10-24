import java.util.*;
import java.io.*;
public class Xor1 {
    /* Save this in a file called Main.java to compile and test it */

    /* Do not add a package declaration */


/* You may add any imports here, if you wish, but only from the
   standard library */

    public static int processArray(ArrayList<Integer> array) {

        ArrayList<Integer> updatedArray = new ArrayList<>();
        for(Integer i:array)
        {
            if(i<100)
                updatedArray.add(i);
        }
        if(updatedArray.size()==0)
            return 0;
        else{
            Collections.sort(updatedArray,Collections.reverseOrder());
            return updatedArray.get(0);
        }
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
