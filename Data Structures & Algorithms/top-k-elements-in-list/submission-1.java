class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map1=new HashMap<>();
        List<Integer>[] bucket=new List[nums.length+1];
        
        for(int i=0;i<nums.length;i++){
            map1.put(nums[i],map1.getOrDefault(nums[i],0)+1);
        }

        for(int key:map1.keySet()){
            int frequency=map1.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] res=new int[k];
        int counter=0;

        for(int pos=bucket.length-1;pos>=0 && counter<k;pos--){
            if(bucket[pos]!=null){
                for(Integer integer:bucket[pos]){
                    res[counter++]=integer;
                }
            }

        }


        return res;
        //for whichever the values is max extract that


    }
}
