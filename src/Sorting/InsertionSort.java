package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        sort(new int[]{64,25,12,22,11});
    }
    private static void sort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i:arr)
            System.out.print(i+" , ");
    }
}
