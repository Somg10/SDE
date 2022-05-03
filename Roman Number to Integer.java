// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        char arr[] = str.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
       
        int ans=0;
        int l = arr.length;
        for(int i=0;i<l-1;i++){
            if(hm.get(arr[i])>=hm.get(arr[i+1])){
                ans+=hm.get(arr[i]);
            }
            else{
                ans-=hm.get(arr[i]);
            }
        }
        ans+=hm.get(arr[l-1]);
           
        return ans;

    }
}
