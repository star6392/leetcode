class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        


        Map<String,List<String>> hmap = new HashMap<>();

        int count=0;

        for (String str:strs){
            int[] freq = new int[26];

            for(int i=0;i<str.length();i++){
                freq[str.charAt(i)-'a']++;
            }
            String bruh = Arrays.toString(freq);

            if(!(hmap.containsKey(bruh))){
                hmap.put(bruh, new ArrayList<>());
            }

            hmap.get(bruh).add(str);

        }
        
        return new ArrayList<>(hmap.values());


    }

}
