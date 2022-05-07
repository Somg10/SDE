// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        StringBuilder str=new StringBuilder();
       int[] count1=new int[26];
       int[] count2=new int[26];
       Arrays.fill(count1,0);
       Arrays.fill(count2,0);
       for(int i=0;i<A.length();++i)
           ++count1[A.charAt(i)-'a'];
       for(int j=0;j<B.length();++j)
           ++count2[B.charAt(j)-'a'];
       for(int k=0;k<26;++k)
       {
           if(count1[k]!=0 && count2[k]==0 || count2[k]!=0 && count1[k]==0)
               str.append((char)(k+'a'));
       }
       if(str.length()==0)
           return "-1";
       else
           return str.toString();
    }
}
