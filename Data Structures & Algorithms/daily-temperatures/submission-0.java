class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //stack problem
        int n=temperatures.length;
        int[] ans=new int[n];
       Stack<Integer> differ=new Stack<Integer>();
       for(int i=0;i<n;i++){
         while(!differ.isEmpty() && temperatures[differ.peek()]<temperatures[i]){
                int idx=differ.pop();
                ans[idx]=i-idx;
                
         }
         differ.push(i);
       }
        return ans;
        
    }
}
