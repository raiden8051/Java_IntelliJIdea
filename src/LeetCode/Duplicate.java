package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,2,3}));
    }
    public static boolean findDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
