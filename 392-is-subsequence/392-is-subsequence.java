class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        if(s.length()<=0||t.length()<=0){
            return true;
        }
        int j=0;
        for(int i=0;i<t.length()&&j<s.length();i++){
            char ch1=t.charAt(i);
            char ch2=s.charAt(j);
            if(ch1==ch2){
                j++;
            }
        }
        if(j==s.length()){
            return true;
        }
    return false;
    }
}