class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> bruh = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if (bruh.containsKey(nums[i])){
                return true;
            }
            bruh.put(nums[i],1);
        }
        return false;
    }
}
