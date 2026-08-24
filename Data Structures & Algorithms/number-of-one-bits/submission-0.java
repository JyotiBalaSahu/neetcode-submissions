class Solution {
    public int hammingWeight(int n) {
        //return in binary format
        // there are two different ways 
        //mod 2 or & 2
        //shift it to the right
        int res=0;
        while(n>0){
            res+=n%2;
            n=n>>1;
        }

        return res;
         



    }
}
