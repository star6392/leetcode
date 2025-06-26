class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        int a;
        int b;
        
        for(int i=0;i<tokens.length;i++){
            String c= tokens[i];
            

            switch(c){
                case "+":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(a+b);
                    break;

                case "-":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(b - a);
                    break;

                case "*":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(a*b);
                    break;

                case "/":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(b/a);
                    break;

                default:
                    stack.push(Integer.parseInt(c));

            }

        }

        return stack.peek();   


    }
}
