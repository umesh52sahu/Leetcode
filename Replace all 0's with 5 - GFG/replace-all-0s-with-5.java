//{ Driver Code Starts
import java.util.*;
class Replace{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		Solution g=new Solution();
		System.out.println(g.convertFive(n));
	}
}
}
// } Driver Code Ends


/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
    //add code here.
       int temp=0;
       int pow=1;
       while(n>0){
           if(n%10==0){
               temp=temp+5*pow;
               pow*=10;
           } else{
               temp=temp+(n%10)*pow;
               pow*=10;
           }
           n=n/10;
       }
       return temp;
    }
}