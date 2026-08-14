class Solution {
    public boolean isAnagram(String s, String t) {
        //if the frequency of characters in both are same than its a valid anagram --//
        //brute force is sort them and then compare 
        if(s.length()!=t.length()) return false;
        
        int[] frequency=new int[26];

        for(int i=0;i<s.length();i++){
            frequency[s.charAt(i)-'a']++;
            frequency[t.charAt(i)-'a']--;
        }
            for(int j=0;j<26;j++){
                if(frequency[j]!=0) return false;
            }
            return true;
    }
}
