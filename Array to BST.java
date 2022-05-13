// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   
    static int[] b;static int i;
    public static void find(int[] nums,int s ,int e){
        if(s>e) return;
        if(s==e){
            b[i] = nums[s];
            i+=1;
            return;
        }
        b[i] = nums[s+(e-s)/2];
        i+=1;
        find(nums,s,s+((e-s)/2)-1);
        find(nums,s+((e-s)/2)+1,e);  
    }
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here
        i=0;
        b=new int[nums.length];
        find(nums,0,nums.length-1);
        return b;
    }
}
