class Solution {
    public int maxArea(int[] heights) {
        // maxarea=height*width;
        int n = heights.length;
        int area = 0;
        int left=0, right=n-1;
while(left<right){
                int length = Math.min(heights[left], heights[right]);
                int width = right - left;
                area = Math.max(area, length * width);
                if(heights[left]<heights[right]){
                    left++;
                }else{
                    right--;
                }
            }
        return area;
    }
}

