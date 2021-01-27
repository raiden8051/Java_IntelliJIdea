package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TS {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(1);
        al.add(9);
        int[] arr = new int[]{4,3,5,21,1};
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
        ts.addAll(al);
        ts.forEach(i->System.out.println(i));
    }
}
