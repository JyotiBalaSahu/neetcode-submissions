class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counter=new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }

        boolean ans=Arrays.stream(counter).allMatch(x->x==0);

        return ans;
        
    }
}
