import java.util.*;
import java.time.*;
import java.lang.*;
public class SortCompare {
    public static void BubbleSort(int[] x,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(x[j]>x[j+1])
                {
                    int temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
    }
    public static void MergeSort(int[] a, int low, int high)
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        MergeSort(a, low, mid); 
        MergeSort(a, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];   
    }
    public static int[] genRandomArray(int n)
    {
        int x[]=new int[n];
        for(int i=0;i<n;i++)
            x[i]=(int)(Math.random() * 100); //Random integers between 0 and 100
        return x;
    }
    public static void main(String args[])
    {        
        int n=10000;
        int a[]=genRandomArray(n);
        
        long startTime = System.currentTimeMillis();
        
        //select either bubble or merge sort here
        //BubbleSort(a,n);
        MergeSort(a,0,n);
        
        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;
        System.out.println("Total time "+totalTime);
    }
}
