package Hackerrank;

import java.util.Scanner;

//1
//14 5
//0 0 0 1 1 1 0 0 1 0 1 1 0 0 0

public class JavaArrayPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin2(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        //boolean flag = true;
        //int ctr_one = 0;
        for(int i=0;i<game.length-1;i++){
            // if(i==game.length-1)
            //     return true;
            if(game[i]==0 && game[i+1]==0)
                continue;
            else if(game[i]==0 && game[i+1]==1){
                if((i+leap)>=(game.length-1))
                    return true;
                else{
                    if(game[i+leap]==1)
                        return false;
                    else
                    {
                        i+=leap-1;
                        continue;
                    }
                }
            }
            else{
                if(game[i-1]==0)
                    i-=2;
            }
        }
        return true;
    }
    public static boolean canWin2(int leap, int[] game){
        for(int i=0;i<game.length;i++) {
            if (game[0] == 1)
                return false;
            else{
                if(i+leap<game.length) {
                    if(game[i+leap]==0)
                        i+=leap-1;
                    else{
                        if(i+leap-1>=0)
                        {
                            if(game[i-1]==0)
                                i-=2;
                        }
                    }
                }
                else
                    return true;
            }
        }
        return true;
    }
}
