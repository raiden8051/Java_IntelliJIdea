package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        sort(new int[]{64,25,12,22,11});
    }
    private static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++)
                if(arr[j]<arr[min])
                    min = j;

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i:arr)
            System.out.print(i+" , ");
    }
}
