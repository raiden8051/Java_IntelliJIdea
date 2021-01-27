package Tution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloCat {
    public static void main(String[] args) {
       System.out.println(WordSplit(new String[]{"abcgefd","a,ab,abc,abcg,b,c,dog,e,efd,zzz"}));
    }
    public static String WordSplit(String[] strArr){
        List<String> li = Arrays.asList(strArr[1].split(","));
        for(int i=0;i<strArr[0].length();i++){
            if(li.contains(strArr[0].substring(0,i))){
                if(li.contains(strArr[0].substring(i)))
                    return strArr[0].substring(0,i)+","+strArr[0].substring(i);
            }
        }
        return "not possible";
    }
}
