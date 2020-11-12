package Sorting;

import java.util.Random;

public class QuickSort<T>{

    public void random(T arr[],int low,int high)
    {

        Random rand= new Random();
        int pivot = rand.nextInt(high-low)+low;

        T temp1=arr[pivot];
        arr[pivot]=arr[high];
        arr[high]=temp1;
    }
    public Integer partition(T[] arr,int low, int high)
    {
        random(arr,low,high);
        T pivot = arr[high];
        int i = (low-1);
        boolean exp=false;
        for(int j=low;j<high;j++) {
            String typeName = pivot.getClass().getSimpleName();
            if(typeName.equals("String"))
                exp = ((String)arr[j]).compareTo((String)pivot)<0;
            else if(typeName.equals("Float"))
                exp = (Float)arr[j]<(Float)pivot;
            else if(typeName.equals("Double"))
                exp = (Double)arr[j]<(Double) pivot;
            else if(typeName.equals("Integer"))
                exp = (Integer)arr[j]<(Integer) pivot;
            else if(typeName.equals("Short"))
                exp = (Short)arr[j]<(Short) pivot;
            else if(typeName.equals("Byte"))
                exp = (Byte)arr[j]<(Byte) pivot;
            else if(typeName.equals("Long"))
                exp = (Long)arr[j]<(Long) pivot;
            else if(typeName.equals("Character"))
                exp = (Character)arr[j]<(Character) pivot;
            if (exp) {
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        T temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public void sort(T[] arr,int low,int high)
    {
        if(low<high){
            int m = partition(arr,low,high);
            sort(arr,low,m-1);
            sort(arr,m+1,high);
        }
    }
}

