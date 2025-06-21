class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> hmap= new HashMap<>();

        hmap.put(')','(');
        hmap.put('}','{');
        hmap.put(']','[');
        
        for(int i=0;i<s.length();i++){

            char c=s.charAt(i);

            if(hmap.containsKey(c)){

                if(stack.isEmpty() || hmap.get(c) != stack.peek()){
                    return false;
                }
                stack.pop();
            }

            else{
                stack.push(c);
            }     
        
        }

        return stack.isEmpty();
        
    }
}