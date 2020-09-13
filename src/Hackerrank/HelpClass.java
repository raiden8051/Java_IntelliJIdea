// { Driver Code Starts
//Initial Template for Java
package Hackerrank;

import java.io.*;
import java.util.*;
class HelpClass
{
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
            Sol obj = new Sol();
            System.out.println(obj.maxCities(a,n,m));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    int maxCities(char a[][], int n, int m)
    {
        //code here.
        int ctr = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j!=m-1)
                {
                    if(a[i][j]=='.' && a[i][j+1]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i+1][j]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i+1][j+1]=='*')
                        ctr++;
                }
                else if(i!=0 && j==0)
                {
                    if(a[i][j]=='.' && a[i-1][j]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i][j+1]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i][j+1]=='*')
                        ctr++;
                }
                else if(i==n-1 && j==m-1)
                {
                    if(a[i][j]=='.' && a[i][j-1]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i-1][j-1]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i-1][j]=='*')
                        ctr++;
                }
                else if(i!=0 && j==m-1)
                {
                    if(a[i][j]=='.' && a[i][j-1]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i-1][j-1]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i+1][j-1]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i-1][j]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i+1][j]=='*')
                        ctr++;
                }

                else if(i==n-1 && j!=m-1)
                {
                    if(a[i][j]=='.' && a[i-1][j]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i-1][j+1]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i][j+1]=='*')
                        ctr++;
                }
                else if(i!=0 && j!=0)
                {
                    //up down left right
                    if(a[i][j]=='.' && a[i-1][j]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i+1][j]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i][j-1]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i][j+1]=='*')
                        ctr++;

                    //diagonal
                    else if(a[i][j]=='.' && a[i-1][j-1]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i+1][j+1]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i-1][j+1]=='*')
                        ctr++;
                    else if(a[i][j]=='.' && a[i+1][j-1]=='*')
                        ctr++;
                }
            }
        }
        return ctr;
    }
}