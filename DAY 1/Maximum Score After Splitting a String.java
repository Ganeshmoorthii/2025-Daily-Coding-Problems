class Solution {
    public int maxScore(String s) {
        int ones = 0;
        int zeros= 0;
        int maxi=0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                ones++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == '0'){
                zeros++;
                maxi = Math.max(maxi,ones+zeros);
            }else{
                ones--;
                maxi = Math.max(maxi,ones+zeros);
            }
        }
        return maxi;
    }
}
