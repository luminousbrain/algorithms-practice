package LeetCode.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    private final static Map<Character, Character> mirrorParenthesesMap = new HashMap<>() {{
        put('{', '}');
        put('}', '{');
        put('[', ']');
        put(']', '[');
        put('(', ')');
        put(')', '(');
    }};


    public static void main(String[] args) {
//        System.out.println(new ValidParentheses().isValid("()[]{}")); // true
//        System.out.println(new ValidParentheses().isValid("(]")); // false

        System.out.println(new ValidParentheses().isValid("([)]")); // false
        System.out.println(new ValidParentheses().isValid("{[]}")); // true
    }


    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.addLast(ch);
            } else if (stack.pollLast() != mirrorParenthesesMap.get(ch)) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
