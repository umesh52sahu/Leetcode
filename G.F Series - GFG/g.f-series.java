//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.gfSeries(N);
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    public void gfSeries(int N){
        // code here
        //System.out.print(0 +" ");
        //System.out.print(1 +" ");
        for(int i=0;i<N;i++){
            long num=gf(i);
            System.out.print(num + " ");
           
        }
        System.out.println();
    }
    public long gf(int N){
        if(N==1 || N == 0){
            return N;
        }
        
        
        long temp2=gf(N-2);
        long temp1=gf(N-1);
        long temp=temp2*temp2-temp1;
        return temp;
    }
}