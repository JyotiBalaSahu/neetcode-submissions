class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        
        for(char c:s.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }

        }
        if(sb.toString().equals(sb.reverse().toString())) return true;
        return false;
        
    }
}
