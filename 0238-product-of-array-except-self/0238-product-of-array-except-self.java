class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod_before = new int[nums.length];
        int[] prod_after = new int[nums.length];
        
        int[] ans = new int[nums.length];

        int prod_val_before=1;
        int prod_val_after=1;

        for(int i=0;i<nums.length;i++){
            prod_before[i]= prod_val_before;
            prod_val_before*=nums[i];
            
            prod_after[nums.length-i-1]=prod_val_after;
            prod_val_after*=nums[nums.length-i-1];
        }

        for(int i=0; i<nums.length; i++){
            ans[i]=prod_before[i]*prod_after[i];
        }

        return ans;
    }
}