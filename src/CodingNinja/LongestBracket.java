package CodingNinja;

import java.util.*;

public class LongestBracket {
    public static void main(String[] args) {

        String str = (new Scanner(System.in).nextLine());

        int max = 0, count = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for(int i = 0; i<str.length();i++ ){
            if(str.charAt(i)=='(')
                stack.push(i);
            else{
                stack.pop();

                if(!stack.empty())
                {
                    if(max>(i-stack.peek()))
                        count++;
                    max = Math.max(max, i-stack.peek());
                }
                else
                    stack.push(i);
            }
        }
        if(max>0)
            System.out.print(max+" "+count);
        else
            System.out.print("0 1");
    }
}
