public class goodArray {
    public static void main(String[] args) {
        getarr(40,5);
    }
    public static void getarr(int N,int K){
        int ctr = 0;
        int[] c=new int[2];
        N+=1;
        while(true){
            if(ctr==K)
                break;
            else {
                c = digitCount(N++);
                if (c[0] % 5 == 0)
                    ++ctr;
            }
        }

        System.out.println(c[1]);

    }
    public static int[] digitCount(int n){
        int sum = 0;int temp=0;
        int res = n;
        int[] arr = new int[2];
        while(n>0)
        {
            temp = n%10;
            sum+=temp;
            n/=10;
        }
        arr[0]=sum;
        arr[1]=res;
        return arr;
    }
}
