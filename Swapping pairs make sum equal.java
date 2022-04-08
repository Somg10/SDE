// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class Solution
{
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        // Your code goes here
        Arrays.sort(A);
        Arrays.sort(B);
        int sumA = 0;
        int sumB = 0;
        for(int i=0;i<n;i++){
            sumA+=A[i];
        }
        for(int i=0;i<m;i++){
            sumB+=B[i];
        }
        
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(sumA-A[i]+B[j] == sumB+A[i]-B[j]){
                return 1;
            }else if(sumA-A[i]+B[j] > sumB+A[i]-B[j]){
                i++;
            }else{
                j++;
            }
        }
       
       return -1;
    }
}

