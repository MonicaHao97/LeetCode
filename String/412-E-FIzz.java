class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String> ();
        for (int i = 0; i < n; i++){
            int test = i + 1;
            if (test % 15 == 0){
                result.add(i,"FizzBuzz");
            }
            else if(test % 5 == 0){
                result.add(i,"Buzz");
            }
            else if(test % 3 == 0){
                result.add(i,"Fizz");
            }
            else{
                String element = test + "";
                result.add(i, element);
            }
        }
        return result;
    }
}