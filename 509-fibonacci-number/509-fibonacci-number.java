class Solution {
    public int fib(int n) {
      int num=0;
      int temp1=1;
      int temp2=0;
        if(n==1){
            return temp1;
        } else {
            for(int i=1;i<n;i++){
                temp2=num+temp1;
                num=temp1;
                temp1=temp2;

            }     
        }
        return temp2;
       
    }
}