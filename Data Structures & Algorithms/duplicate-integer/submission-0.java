class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set1=new HashSet<>();
        if(nums.length<=1) return false;
        for(int i=0;i<nums.length;i++){
            if(set1.contains(nums[i])) return true;
            else set1.add(nums[i]);
        }
        return false;
    }
}