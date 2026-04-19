class Solution {
    public boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();

        for(char ch: s.toCharArray()){

            if(ch == '(' || ch == '[' || ch == '{'){
                stk.push(ch);
            }
            else if(ch == '}' && (stk.isEmpty() || stk.pop() != '{')){
                return false;

            }
            else if(ch == ']' && (stk.isEmpty() || stk.pop() != '[')){
                return false;

            }
            else if (ch == ')' && (stk.isEmpty() || stk.pop() != '(')){
                return false;

            }
           // else
             //   stk.push(ch);
                            

        }
        if(!stk.isEmpty()) return false;

        return true;
        
    }
}
