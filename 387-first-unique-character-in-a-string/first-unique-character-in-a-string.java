class Solution {
    public int firstUniqChar(String s) {

        for(int i=0;i<s.length();i++){
            int val = s.charAt(i);
            if(i == s.lastIndexOf(val) && i == s.indexOf(val)){
                return i;
            }
        }
        return -1;
        
    }
}