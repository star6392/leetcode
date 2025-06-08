class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hmap = new HashMap<>();

        List<Integer>[] freq = new List[nums.length+1];

        int[] ans = new int[k];

        for(int i=0;i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }
        
        for(int i=0; i<nums.length; i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: hmap.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];

        int count=0;

        for(int i=freq.length-1; i>=0 ;i--){
            for(int num: freq[i]){
                if(count<k){
                    result[count]=num;
                    count++;
                 }
                else{
                    return result;
                }            
            }
        }
    
        return result;
    }
}