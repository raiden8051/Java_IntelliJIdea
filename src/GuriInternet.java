import java.util.*;
public class GuriInternet {
    public static void main(String[] args)
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int index=0;
        String output="";
        if (s.charAt(0)=='h')
        {
            output="http://";
            index=4;
        }
        else
        {
            output="ftp://";
            index=3;
        }
        int in=index;
        for (int i=index;i<s.length();i++)
        {
            if(s.charAt(i)=='r'&& s.charAt(i+1)=='u')
            {
                index=i;
                break;
            }
        }
        for (int i=in;i<index;i++)
        {
            output+=s.charAt(i);
        }
        output+=".ru/";
        for(int i =index+2;i<s.length();i++)
        {
            output+=s.charAt(i);
        }

    System.out.println(output);
    }
}
