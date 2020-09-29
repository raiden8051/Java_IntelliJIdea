package Hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class SpiritualCity {
        public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                int m = sc.nextInt();
                char a[][] = new char[n][m];
                for (int i = 0; i < n; ++i)
                {
                    String s = sc.next();
                    for (int j = 0; j < m; ++j)
                    {
                        a[i][j] = s.charAt(j);

                    }
                }
                Solution obj = new Solution();
                System.out.println(obj.maxCities(a,n,m));
            }
        }
    }// } Driver Code Ends
class Solution{
        int maxCities(char a[][], int n, int m) {
            int ctr = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    try {
                        //up down left right
                        if(i==0)
                        {

                        }
                        if(j==0)
                        {

                        }
                        if(i==n-1)
                        {

                        }
                        if(j==m-1)
                        {

                        }
                        if (a[i][j] == '.' && a[i - 1][j] == '*')
                            ctr++;
                        else if (a[i][j] == '.' && a[i + 1][j] == '*')
                            ctr++;
                        else if (a[i][j] == '.' && a[i][j - 1] == '*')
                            ctr++;
                        else if (a[i][j] == '.' && a[i][j + 1] == '*')
                            ctr++;

                            //diagonal
                        else if (a[i][j] == '.' && a[i - 1][j - 1] == '*')
                            ctr++;
                        else if (a[i][j] == '.' && a[i + 1][j + 1] == '*')
                            ctr++;
                        else if (a[i][j] == '.' && a[i - 1][j + 1] == '*')
                            ctr++;
                        else if (a[i][j] == '.' && a[i + 1][j - 1] == '*')
                            ctr++;
                    }
                    catch (ArrayIndexOutOfBoundsException ex){
                        continue;
                    }
                }
            }

            return ctr;
        }
}
