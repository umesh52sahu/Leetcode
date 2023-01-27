//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int key = sc.nextInt();
		    Solution ob=new Solution();
		    int ar[]=ob.findIndex(arr,n,key);
		    System.out.println(ar[0]+" "+ar[1]);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
    public int[] findIndex(int a[], int N, int key) 
    { 
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        
        index(a,N,key,ans);
        return ans;
    }
    
    public void index(int a[], int N , int key, int[] ans){
        if(N==0){
            return;
        }
        
        if(a[N-1]==key){
            ans[0]=N-1;
        }
        index(a,N-1,key,ans);
        if(a[N-1]==key){
            ans[1]=N-1;
        }
    }
}
