//{ Driver Code Starts
import java.util.Scanner;



class PrintPattern
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			GfG g = new GfG();
			g.printPat(n);
			System.out.println();
		
		t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    void printPat(int n)
    {
         // Your code here
         for(int i=0;i<n;i++){
            int temp=n;
            int count=0;
             for(int j=(n-i)*n;j>0;j--){
                 if(count==n-i){
                     temp=temp-1;
                     count=0;
                 }
                 count++;
                 System.out.print(temp + " ");
             }
             System.out.print("$");
         }
    }
}