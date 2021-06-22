class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //Create an int array of length 26
        //Each to store value for a distinct character
        int[] letters = new int[26];
        
        //ransomNote <= magazine in true case
        //Starts with magazine letters
        //Each letter finds its position in array and assign value
        for(int i = 0; i < magazine.length(); i ++) {
            letters[magazine.charAt(i) - 'a'] ++;
        }
        
        //Each value in ransomNote finds its position and minus value
        //If < 0  means magazine did not contain this letter
        //Return false; else return true after looping
        for(int i = 0; i < ransomNote.length(); i ++) {
            if(--letters[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}