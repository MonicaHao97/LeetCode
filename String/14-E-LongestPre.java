class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        
        //Assume the prefix is the first string in the list
        String prefix = strs[0];
        
        //Loop from the 2nd string in the list: i = 1
        //indexOf() returns the first appearance of a String
        //If prefix not the first appearance. shorten one letter from end
        //Use substring(0, last letter). Until becomes prefix
        //Then move on to the next index. return final prefix
        for(int i = 1; i < strs.length; i ++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        
        return prefix;
    }
}