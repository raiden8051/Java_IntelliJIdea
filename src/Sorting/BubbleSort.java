package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        sort(new int[]{11,12,22,64,98});
    }
    private static void sort(int[] arr){
        //for optimised bubble sort
        boolean swap;
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            swap = false;
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            if(!swap)
                break;
        }
        for(int i:arr)
            System.out.print(i+" , ");
    }
}
