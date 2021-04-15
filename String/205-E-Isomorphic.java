class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        HashMap<Character,Character> temp = new HashMap<> ();
        
        if(s.length() == 0 || s.length() <= 1){
            return true;
        }
        
        for(int i = 0; i < s1.length; i ++){
            if(temp.containsKey(s1[i])){
                if(!temp.get(s1[i]).equals(t1[i]))
                    return false;
            }
            else{
                if(!temp.containsValue(t1[i])){
                    temp.put(s1[i],t1[i]);
                }
                else{
                    return false;
                }
            }  
        }
        return true;
    }
}