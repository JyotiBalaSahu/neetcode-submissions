class Solution {
    public boolean isPalindrome(String s){
        //Use two pointer to resolve this
        int n=s.length();
        int left=0; int right=n-1;
        s=s.toLowerCase();
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))) left++;
            else if(!Character.isLetterOrDigit(s.charAt(right))) right--;
            else if(s.charAt(left)!=s.charAt(right)) return false;
            else{
                left++;
                right--;
            }
        }
        return true;
        }

        }
    
