class Solution {
    public long minTime(int[] skill, int[] mana) {
        int potions=mana.length;
        int wizards=skill.length;

        long[] arr = new long[wizards+1];

        for(int i =0;i<potions;i++){
            
            
            long tmp[] = new long[wizards+1];
            
            //first pass
            for(int j=1;j<=wizards;j++){
                tmp[j] = Math.max(arr[j],tmp[j-1]) + skill[j-1]*mana[i];
            }

            

            //second pass
            for(int j=wizards-1;j>=0;j--){
                tmp[j] = tmp[j+1] - (mana[i]*skill[j]);
            }

            arr = Arrays.copyOf(tmp, tmp.length);
        }

        return arr[wizards];

    }
}