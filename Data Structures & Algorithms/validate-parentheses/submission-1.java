class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // For comparing if an open paren has a closer
        Map<Character, Character> opposites = new HashMap<>();
        opposites.put(')','(');
        opposites.put('}','{');
        opposites.put(']','[');

        //iterate through our string.
        for(char c : s.toCharArray()){
            //if we are looing at an closer
            if(opposites.containsKey(c)){
                //if we have something in the stack and the thing at the top is the corresponding opener
                if(!stack.isEmpty() && stack.peek() == opposites.get(c))
                stack.pop();
                else
                //if it's not a pair it fails
                return false;
            }
            //Put in openings
            else stack.push(c);
        }
        //If we have unclosed sets we get false otherwise true
        return stack.isEmpty();
    }
}
