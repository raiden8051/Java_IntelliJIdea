package TCS;

public class Duplicate {
    static int ctr = 0;
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 3, 2, 4, 3, 2, 5};
        findDuplicate(arr);
    }

    private static void findDuplicate(int[] arr) {
        int max1=0,max2=0,max3=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2)
            {
                max3 = max2;
                max2 = arr[i];
            }
            else if(arr[i]>max3){
                max3 = arr[i];
            }
        }
        System.out.println(max3);
    }
}

