class Solution {
    public int trap(int[] height) {
        
        int n=height.length;
        int ans=0;
        int water=0;

        int[] pref = new int[n];
        int[] suff = new int[n];
        int max =0;

        for(int i=0;i<n;i++){
            pref[i]=max;

            if(height[i]>max){
                max=height[i];
            }
        }

        max=0;

        for(int i=n-1;i>=0;i--){
            suff[i]=max;
            if(height[i]>max){
                max=height[i];
            }
        }


        for(int i=0;i<n;i++){
            water = Math.min(pref[i],suff[i])-height[i];
            if(water>0){
                ans+=water;
            }
        }

        return ans;
    }

}