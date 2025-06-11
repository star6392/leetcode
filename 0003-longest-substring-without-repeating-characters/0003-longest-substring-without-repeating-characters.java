class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int ans=0;
        
        Set<Character> hset =new HashSet<>();

        while (j<s.length()){

            System.out.println("i:"+i+" j:"+j);

            if(hset.contains(s.charAt(j))){
                ans = Math.max(ans,j-i);
                hset.remove(s.charAt(i));
                i++;
            }
                
            else{
                hset.add(s.charAt(j));
                j++;
                ans = Math.max(ans,j-i);
            }
        }
       
        return ans;      
    }
}
