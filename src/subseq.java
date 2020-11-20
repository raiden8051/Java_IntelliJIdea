import java.util.Scanner;

public class subseq {

    public static String SearchingChallenge(String str) {
        int k = Character.getNumericValue(str.charAt(0));
        int temp = k-1, max = Integer.MIN_VALUE, ctr = 0;
        int iteration = 1;
        String alreadyChecked = str.charAt(1)+"";
        String result = "", tempResult = "";
        for(int i=1;i<str.length();i++){
            if(alreadyChecked.contains(str.charAt(i)+"")){
                tempResult+=str.charAt(i);
                ctr++;
            }
            else{
                if(temp!=0)
                {
                    ctr++;
                    temp--;
                    alreadyChecked+=str.charAt(i);
                    tempResult+=str.charAt(i);
                }
                else{
                    if(ctr>max)
                    {
                        max = ctr;
                        result = tempResult;
                    }
                    ctr = 1;
                    i = ++iteration-1;
                    temp = k-1;
                    alreadyChecked = str.charAt(i+1)+"";
                    tempResult="";
                }
            }
        }
        if(ctr>max)
        {
            result = tempResult;
        }
        return result;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
    }

}

