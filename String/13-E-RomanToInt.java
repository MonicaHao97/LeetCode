class Solution {
    public int romanToInt(String s) {
        //Use a map as dictionary for Roman to Int
        Map<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);
        
        
        int sum = 0;
        int prevInt = 0;
        //Use index from the highest: smallest Roman
        int index = s.length() - 1;
        //Convert to CharArray for indexing
        char[] roman = s.toCharArray();
        while(index >= 0) {
            //Access curInt use map
            int curInt = dictionary.get(roman[index]);
            
            //Speical case: 4, 9, 40 etc
            //Common: IV the smaller index value < bigger index value
            //If that's the case, minus curInt, if not, plus sum
            if(curInt >= prevInt) {
                sum += curInt;
            }else{
                sum -= curInt;
            }
            
            //Update index and prevInt
            index --;
            prevInt = curInt;
        }
        
        return sum;
    }
}