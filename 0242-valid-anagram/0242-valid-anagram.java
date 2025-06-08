class Solution {
    public boolean isAnagram(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();


        if (s_len!=t_len) return false;
        
        int[] bruh = new int[26];
        for(int i=0;i<s_len;i++){
            bruh[s.charAt(i)-'a']++;
            bruh[t.charAt(i)-'a']--;
        }

        for(int i:bruh){
            if(i!=0) return false;
        }

        return true;
    }
}
