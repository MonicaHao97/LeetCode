class Solution {
    public int firstUniqChar(String s) {
        //Use letters dictionary
        int[] letters = new int[26];
        
        //Counts each letter by ++
        for(int i = 0; i < s.length(); i ++) {
            letters[s.charAt(i) - 'a'] ++;
        }
        //Check the first letter In String with value 1
        //return index else -1
        for(int i = 0; i < s.length(); i ++) {
            if(letters[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}