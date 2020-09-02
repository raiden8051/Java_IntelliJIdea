package CodingNinja;

public class GoogleQuestion {

    /*
     [1,2,3,4] => [1,2,3,5]
     [1,9,9,9] => [2,0,0,0]
     [9,9,9,9] => [1,0,0,0,0] *Edge Case
     Using Recursion
     */
    
    public static void main(String[] args) {
        int[] arr = new int[]{9,9,9,9,9,9,9,9,9};

        addOne(arr, 1, arr.length-1);
    }
    public static void addOne(int[] arr, int carry, int index){
        if(index==-1){
            for(int n:arr)
                System.out.print(n+" ");
            return;
        }
        else{
            int sum = arr[index] + carry;
            arr[index] = sum % 10;
            if(index == 0 && carry == 1) {
                arr = new int[arr.length + 1];
                arr[0] = 1;
            }
            else if(sum<=9)
                index = 0;
            else
                carry = 1;
            addOne(arr, carry, index - 1);
        }
    }
}
