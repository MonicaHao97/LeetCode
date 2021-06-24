class Solution {
    public String addStrings(String num1, String num2) {
	//Use new StringBuilder to avoid converting Strings to int
	//Use a carry int for carry-on value
        StringBuilder result = new StringBuilder();
        int carry = 0;
	
	//For loop: starts with length - 1(single digit)
	//Stop until reaches the end: >= 0 or carry value is 0 (no new digit needed)
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry > 0; i --, j --) {

	    //Check if reaches end: i/j < 0
	    //If so, x/y = 0 for new digits in case, else store the char using ASCII table
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';

	    //Append the sum (x + y + carry)%10 to StringBuilder
	    //Update carry (x + y+ carry)/10
            result.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        
	//Use reverse and toString to return result
        return result.reverse().toString();
    }
}