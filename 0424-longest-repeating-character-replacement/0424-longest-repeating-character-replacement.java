class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> hmap = new HashMap<>();
        int ans=0, i=0, j=0, maxCount=0;

        while(j<s.length()){
            hmap.put(s.charAt(j),hmap.getOrDefault(s.charAt(j),0)+1);
            maxCount=Math.max(maxCount,hmap.get(s.charAt(j)));
            if((j-i+1)-maxCount<=k){
                ans=Math.max(ans,j-i+1);
            }
            else{
                hmap.put(s.charAt(i),hmap.get(s.charAt(i))-1); 
                i++;
            }
            j++;
        }

        return ans;
          
    }
}
