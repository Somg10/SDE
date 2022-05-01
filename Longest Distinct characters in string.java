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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        HashMap<Character,Integer>map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        
        while(j<S.length())
        {
            char ch = S.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1 );
            
            if(map.size() == j-i+1){
                max = Math.max(max,j-i+1);
            }
            
            // remove elements if repeating elements found
            if(map.size() < j-i+1)
            {
                while(map.size() < j-i+1){
                    char ci = S.charAt(i);
                    map.put(ci,map.get(ci)-1);
                    if(map.get(ci) == 0){
                        map.remove(ci);
                    }
                    i++;
                } 
            }
           
            j++;
        }
        if(max == Integer.MIN_VALUE){
            return -1;
        }
        return max;
        
    }
}
