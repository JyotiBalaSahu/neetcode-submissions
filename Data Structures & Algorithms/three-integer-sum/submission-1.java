class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //three digits and i,j,k all are distinct
        //nums[i]+nums[j]+nums[k]=0
        //sort given array
       List<List<Integer>> res = new ArrayList<>();
        
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Step 2: Early termination optimization
            if (nums[i] > 0) {
                break;
            }
            
            // Step 3: Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Step 4: Two-pointer setup
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];
                
                if (total < 0) {
                    left++; // Need a larger sum
                } else if (total > 0) {
                    right--; // Need a smaller sum
                } else {
                    // Found a valid triplet
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Move pointers and skip duplicates for left and right elements
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    left++;
                    right--;
                }
            }
        }
        
        return res;
    }
}