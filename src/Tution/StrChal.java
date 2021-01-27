package Tution;

public class StrChal {
    public static void main(String[] args) {
        System.out.println(StringChallenge(new String[]{"44","111111"}));
    }
    public static int StringChallenge(String[] strArr){
        int ctr = 0;
        String binary = "";
        int val = Integer.parseInt(strArr[0]);
        while(val>0){
            int rem = val%2;
            val/=2;
            binary+=rem;
        }
        int len = binary.length()-1;
        String givenBinary = strArr[1];
        for(int i=0;i<givenBinary.length();i++)
        {
            if(givenBinary.charAt(i)!=binary.charAt(len--))
                ctr++;
        }
        return ctr;
    }
}
