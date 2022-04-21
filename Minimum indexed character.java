// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


 // } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),i);
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i=0;i<patt.length();i++){
            if(hm.containsKey(patt.charAt(i))){
                res = Math.min(res,hm.get(patt.charAt(i)));
            }
        }
        if(res==Integer.MAX_VALUE)  return -1;
        else    return res;
    }
    
}

// { Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}
  // } Driver Code Ends
