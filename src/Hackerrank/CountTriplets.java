package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CountTriplets {
    public static void main(String[] args) {
        List<Long> arr = new ArrayList<>();
        arr.add(1l);
        arr.add(3l);
        arr.add(9l);
        arr.add(9l);
        arr.add(27l);
        arr.add(81l);
        System.out.println(countTriplets(arr, 3));
    }
    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {

        long tripletCtr = 0;
        for(int i=0;i<arr.size();i++)
        {
            if(recurse(arr, arr.get(i), 0, r)==3)
                tripletCtr++;
        }
        return tripletCtr;
    }

    public static int recurse(List<Long> arr, long value, int tripletCtr, long multiplier)
    {
        int index = binarySearch(arr, value, 0, arr.size()-1);
        if(index==-1 || tripletCtr == 3)
            return tripletCtr;
        else{
            long val = arr.get(index)*multiplier;
            return recurse(arr, val, tripletCtr+1, multiplier);
        }
    }

    public static int binarySearch(List<Long> arr,long k, int l, int r){
        if(r>=l) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == k)
                return mid;
            else if (arr.get(mid) > k)
                return binarySearch(arr, k, l, mid - 1);
            else
                return binarySearch(arr, k, mid + 1, r);
        }
        return -1;
    }
}
