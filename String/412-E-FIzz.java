class Solution {
    public List<String> fizzBuzz(int n) {
        //Create String ArrayList for result
        List<String> result = new ArrayList<String>(n);
        
        //Use for loop to track each int
        //Use fizz and buzz for threshold
        for(int i = 1, fizz = 0, buzz = 0; i <= n; i ++) {
            //Increate threshold num firstly
            fizz ++;
            buzz ++;
            
            //Check for 15's case first
            //Only when 3 and 5 arrives at same num
            if(fizz == 3 && buzz == 5) {
                //Add String and clear the nums
                result.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            }
            //Check for fizz
            else if(fizz == 3) {
                result.add("Fizz");
                fizz = 0;
            }
            //Check for buzz
            else if(buzz == 5) {
                result.add("Buzz");
                buzz = 0;
            } 
            //Add String to Int values
            else {
                result.add(String.valueOf(i));
            }
        }
        
        return result;
    }
}