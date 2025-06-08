class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hmap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int search = target-nums[i];

            if(hmap.containsKey(search)){
                return new int[]{hmap.get(search),i};
            }

            else{

                hmap.put(nums[i],i);
            }    
        }

        return new int[]{0,0};
    }
}
