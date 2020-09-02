package CodingNinja;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        recurse(s, s.charAt(0), 0);
    }
    public static void recurse(String s, char ch, int counter){

        if(counter==s.length()){
            System.out.print(ch);
            return;
        }
        else{
            if(s.charAt(counter)!=ch){
                System.out.print(s.charAt(counter-1));
                ch=s.charAt(counter);
            }
            recurse(s, ch, counter + 1);
        }

    }
}
