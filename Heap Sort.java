// { Driver Code Starts
import java.util.*;
class Heap_Sort
{
    void printArray(int arr[],int n)
    {
        //int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        Heap_Sort hs = new Heap_Sort();
        int arr[] = new int[1000000];
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
                
            Solution ob=new Solution();
            ob.heapSort(arr,n);
            hs.printArray(arr,n);
            T--;
        }
    }
    
}


// } Driver Code Ends


class Solution{
    
    private void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n){
        // Your code here
        int child = n;
        int par = (child-1)/2;
        while(child>0 && arr[par]<arr[child]){
            swap(arr,par,child);
            child = par;
            par = (child-1)/2;
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i){
        // Your code here
        swap(arr,0,n);
        int par = 0;
        int child1 = 1;
        int child2 = 2;
        while(child1<n){
            if(child2>=n){
                if(arr[par]<arr[child1]) swap(arr,par,child1);
                return;
            }
            if(arr[par]>arr[child1] && arr[par]>arr[child2]) return;
            if(arr[child1]>arr[child2]){
                swap(arr,par,child1);
                par = child1;
            }else{
                swap(arr,par,child2);
                par = child2;
            }
            child1 = 2*par+1;
            child2 = 2*par+2;
        }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n){
        //code here
        for(int i=0;i<n;i++) buildHeap(arr,i);
        for(int i=0;i<n;i++) heapify(arr,n-i-1,i);
    }
 }
