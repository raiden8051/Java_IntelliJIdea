package Searching;

import Sorting.QuickSort;

public class BinarySearch {
    public static void main(String[] args) {
        Search<Integer> s = new Search<>();
        QuickSort<Integer> q = new QuickSort<>();
        Integer[] a = {1,5,4,2,6,8};
        //q.sort(a,0,a.length-1);
        if(s.initiate(a,4)!=-1)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
class Search<T>{
    public int initiate(T[]arr, T value){
        return find(arr,0,arr.length-1,value);
    }
    public int find(T[] arr,int l,int r, T value){
        if(r>=l){
            int mid = l+(r-1)/2;
            if(arr[mid]==value){
                return mid;
            }
            if((Integer)arr[mid]>(Integer)value){
                return find(arr,l,mid-1,value);
            }
            return find(arr,mid+1,r,value);
        }
        return -1;
    }
}
