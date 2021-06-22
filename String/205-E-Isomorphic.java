class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Create an int array with length 512 (256 *2)
        int[] compare = new int[512];
        
        //If two strings are isomorphic, should return same value at same index
        //If not, return false
        //Add i + 1 for each index (avoid 0, since its default value)
        for(int i = 0; i < s.length(); i ++) {
            if(compare[s.charAt(i)] != compare[t.charAt(i) + 256]) {
                return false;
            }
            compare[s.charAt(i)] = i + 1;
            compare[t.charAt(i) + 256] = i + 1;
        }
        
        return true;
    }
}