package CodingNinja;

public class FindFloorValue {
    public static int ctr = 0;
    public static void main(String[] args) {
        System.out.println(findFloor(new int[] {10,20,30,40,50}, 25, 0));
    }
    public static int findFloor(int[] array, int element, int index){
        //Write your code here
        int result = 0;
        result = (checkData(array, element, 0));
        return result;
    }
    public static int checkData(int[] array,int element,int index)
    {
        System.out.println(ctr++);
        if(index==array.length){
            return 1;
        }
        else{
            if(array[index]>element)
                return (array[index-1]);
            else
                return checkData(array,element,index+1);
        }
    }
}
