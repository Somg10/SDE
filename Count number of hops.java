// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of steps in stair
            int n = sc.nextInt();
            
            //calling method countWays() of class Hops
            System.out.println(new Solution().countWays(n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays_tabu(int N, long[] dp) {
        
        for(int n = 0; n <= N; n++) {
            if(n < 0)
                return 0;
            
            if(n == 0) {
                dp[n] = 1;
                continue;
            }
                
            long count = 0;
            
            if(n - 1 >= 0)
                count = (count % 1000000007 + dp[n - 1]  % 1000000007)  % 1000000007 ;
            if(n - 2 >= 0)
                count = (count% 1000000007 + dp[n - 2] % 1000000007)  % 1000000007 ;
            if(n - 3 >= 0)
                count = (count % 1000000007 + dp[n - 3]  % 1000000007)  % 1000000007 ;
                
            dp[n] = count;
        }
        return dp[N];
    }
    static long countWays(int n)
    {
        // add your code here
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1L);
        return countWays_tabu(n, dp) % 1000000007;
    }
    
}

