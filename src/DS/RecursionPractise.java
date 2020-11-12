package DS;

public class RecursionPractise {
    public static void main(String[] args) {
        GFG2 p = new GFG2();
        p.fun();
    }
}

class Pattern{
    void print(int n){
        if(n>1)
            print(n-1);
        for(int i=0;i<n;i++)
            System.out.print("*");
        System.out.println();
    }
}
class GFG {

    static void fun(int x) {
        if (x > 0) {
            fun(--x);
            System.out.print(x + " ");
            fun(--x);
        }
    }
}
class GFG2{
    static void fun()
    {
        Integer i = new Integer(10);
        System.out.println(i.getClass().getName());
        String j = new String("10");
        System.out.println(j.getClass().getSimpleName());
//        if (i % 2 == 1) return (i);
//        else return fun(fun(i - 1));
    }
}