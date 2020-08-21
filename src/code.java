import java.util.*;
public class code {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String value  = sc.nextLine();
        System.out.println(value);
        getData(value);
    }
    public static void getData(String val){

        int z=0,o=0,t=0,th=0,f=0,fi=0,s=0,se=0,e=0,n=0;
        for(int i=0;i<val.length();i++) {
            switch (val.charAt(i)) {
                case '0':
                    z++;
                    break;
                case '1':
                    o++;
                    break;
                case '2':
                    t++;
                    break;
                case '3':
                    th++;
                    break;
                case '4':
                    f++;
                    break;
                case '5':
                    fi++;
                    break;
                case '6':
                    s++;
                    break;
                case '7':
                    se++;
                    break;
                case '8':
                    e++;
                    break;
                case '9':
                    n++;
                    break;
            }
        }
        System.out.println(z+" "+o+" "+t+" "+th+" "+f+" "+fi+" "+s+" "+se+" "+e+" "+n);
        }
    }
