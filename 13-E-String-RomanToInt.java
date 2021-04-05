class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char[] c = s.toCharArray();
        int[] roman = new int[c.length];
        for (int i = 0; i < s.length(); i ++){
            if (c[i] == 'M'){
                roman[i] = 1000;
            }
            else if(c[i] == 'D'){
                roman[i] = 500;
            }
            else if(c[i] == 'C'){
                roman[i] = 100;
            }
            else if(c[i] == 'L'){
                roman[i] = 50;
            }
            else if(c[i] == 'X'){
                roman[i] = 10;
            }
            else if(c[i] == 'V'){
                roman[i] = 5;
            }
            else{
                roman[i] = 1;
            }
        }
        
        for(int i = 1; i <= roman.length; i ++){
            int range = i - 1;
            if(i <roman.length && roman[range] < roman[i]){
                sum += roman[i] - roman[range];
                i ++;
              }
            else{
                sum += roman[range];
            }
        }
        return sum;
    }
}