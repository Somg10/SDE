// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[][] t=new int[501][501];
    static int maximumPath(int n, int mat[][])
    {
        // code here
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               t[i][j]=-1;
           }
       }
       int max=-1;
       for(int i=0;i<n;i++){
           int curr=sol(mat,0,i,n);
           if(curr>max)max=curr;
       }
       return max;
   }
   static int sol(int[][] mat,int i,int j,int n){
       if(i==n||j==n||j<0){
           return Integer.MIN_VALUE;
       }
       else if(i==n-1){
           return mat[i][j];
       }
       else if(t[i][j]!=-1){
           return t[i][j];
       }
       else{
           t[i][j]=Math.max(sol(mat,i+1,j,n)+mat[i][j],Math.max(sol(mat,i+1,j+1,n)+mat[i][j],sol(mat,i+1,j-1,n)+mat[i][j]));
       }
       return t[i][j];
    }
}
