// { Driver Code Starts
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
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        Map<Integer,Integer> numMap= new HashMap<Integer,Integer>();
        int temp[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
           numMap.put(nums[i],i); 
           temp[i]=nums[i];
        } 
        Arrays.sort(temp);
   
        int swap= 0;
        int index;
        int value;
       
        for(int i=0;i<temp.length;i++){
       
           if(temp[i]!=nums[i]){
               index=numMap.get(temp[i]);
              
              
               value=nums[index]; 
               nums[index]=nums[i];
               numMap.put(nums[i],index);
               nums[i] = value;
               numMap.put(value,i);
               swap++;
           } 
        }
    
        return swap;
        
    }
}
