class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> opposites = new HashMap<>();
        opposites.put(')','(');
        opposites.put('}','{');
        opposites.put(']','[');
        for(char c : s.toCharArray()){
            if(opposites.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == opposites.get(c))
                stack.pop();
                else
                return false;
            }
            else stack.push(c);
        }
        return stack.isEmpty();
    }
}
