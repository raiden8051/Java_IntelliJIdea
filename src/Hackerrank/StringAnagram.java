package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class StringAnagram {
    public static void main(String[] args) {

        List<Integer> result = new ArrayList<>();
        List<String> query = new ArrayList<>();
        List<String> dictionary = new ArrayList<>();
        query.add("codl");
//        query.add("nark");
//        query.add("bs");
//        query.add("hack");
//        query.add("stair");
        dictionary.add("cold");
        dictionary.add("clod");
        dictionary.add("docl");
//        dictionary.add("khak");
//        dictionary.add("ackh");
//        dictionary.add("kran");
//        dictionary.add("rankhacker");
//        dictionary.add("a");
//        dictionary.add("ab");
//        dictionary.add("ba");
//        dictionary.add("stairs");
//        dictionary.add("raits");

        for(int i=0;i<query.size();i++) {
                int ctr = 0;
                String temp = query.get(i);
                for (int j = 0; j < dictionary.size(); j++) {
                    if (dictionary.get(j).length() == temp.length()) {
                        if (checkAnagram(temp, dictionary.get(j))) {
                            ctr++;
                            dictionary.remove(j);
                        }
                    }
                }
                result.add(ctr);
            }
        for(int s:result)
            System.out.println(s);
    }
    public static boolean checkAnagram(String temp, String str){

        for(int i=0;i<temp.length();i++){
            if(str.indexOf(temp.charAt(i))==-1)
                return false;

        }
        return true;
    }
}
