// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String lowest="";
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i].length()<min)
            {
                min=arr[i].length();
                lowest=arr[i];
            }
        }
        String ans="";
        for(int i=0;i<lowest.length();i++)
        {
            boolean flag=true;
            char c=lowest.charAt(i);
            for(int j=0;j<n;j++)
            {
                if(!arr[j].substring(i,i+1).equals(String.valueOf(c)))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                ans+=c;
            }
            else
            {
                break;
            }
        }
        if(ans.equals(""))
        {
            return "-1";
        }
        return ans;
    }
}
