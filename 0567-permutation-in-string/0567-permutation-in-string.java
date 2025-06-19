class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s2.length()<s1.length()){
            return false;
        }

    
    int[] s1Count = new int[26];
    int[] s2Count = new int[26];

    for(int i=0;i<s1.length();i++){
        s1Count[s1.charAt(i) - 'a']++;
        s2Count[s2.charAt(i) - 'a']++;
    }

    int matches=0;

    for(int i=0;i<26;i++){
        if(s1Count[i]==s2Count[i]){
            matches++;
        }
    }

    int l=0;
    int r=s1.length();

    while(r<s2.length()){
        if(matches==26){
            return true;
        }

        int indexOut = s2.charAt(l) - 'a';
        int indexIn = s2.charAt(r) - 'a';

        s2Count[indexOut]--;

        if(s1Count[indexOut]==s2Count[indexOut]){
            matches++;
        }
        else if(s1Count[indexOut]==s2Count[indexOut]+1){
            matches--;
        }
        
        s2Count[s2.charAt(r) - 'a']++;

        if(s1Count[s2.charAt(r) - 'a']==s2Count[s2.charAt(r) - 'a']){
            matches++;
        }
       else if(s1Count[indexIn]==s2Count[indexIn]-1){
            matches--;
        }

        r++;
        l++; 

    }

    return matches==26;


    }
}

