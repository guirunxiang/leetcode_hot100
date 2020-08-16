/**
 * 11. 有效的括号
 */

class Solution11 {
    public boolean isValid(String s) {
        int len = s.length();
        if(len % 2 == 1) return false;

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if(c == ')') {
                if(stack.isEmpty()) return false;
                if(map.get(stack.peek()) == c){
                    stack.pop();
                }
            }
            else if(c == ']') {
                if(stack.isEmpty()) return false;
                if(map.get(stack.peek()) == c){
                    stack.pop();
                }
            }
            else if(c == '}') {
                if(stack.isEmpty()) return false;
                if(map.get(stack.peek()) == c){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}