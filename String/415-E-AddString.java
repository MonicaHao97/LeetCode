class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder newString = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        
        while(i >= 0 || j >= 0 || carry > 0) {
            int c1 = 0;
            int c2 = 0;
            
            if(i >= 0) {
                c1 = num1.charAt(i) - '0';
            }
            
            if(j >= 0) {
                c2 = num2.charAt(j) - '0';
            }
            
            int sum = (c1 + c2 + carry) % 10;
            carry = (c1 + c2 + carry) / 10;
            
            newString.append(sum);
            i --;
            j --;
        }
        
        return newString.reverse().toString();
    }
}