//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        int num=S.length();
        int ans=1;
        for(int i=1;i<S.length()/2+1;i++){
            String ch1=S.substring(i-1,i);
            
            String ch2=S.substring(num-1,num);
            if(!ch1.equals(ch2)){
                ans=0;
            }
            num--;
        }
        return ans;
        
    }
};