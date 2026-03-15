package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParentheses {
    public static String getTitle() {
        return "20. Valid Parentheses";
    }
    public static String getQuestion() {
        return """
                Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
                determine if the input string is valid.
                An input string is valid if:
                Open brackets must be closed by the same type of brackets.
                Open brackets must be closed in the correct order.
                Every close bracket has a corresponding open bracket of the same type.
                Example 1: Input -> s = "()" -> true
                Example 2: Input -> s = "(){}[]" -> true
                Example 3: Input -> s = "(]" -> false
                Example 4: Input -> s = "([)]" -> false
               """;
    }
    public static String getCode() {
        return """
               
               """;
    }
    public static void solve() {
        Object[][] testCases = {
                {"()",       true},
                {"()[]{}",   true},
                {"(]",       false},
                {"([)]",     false},
                {"{[]}",     true},
                {"",         true},
                {"{",        false},
        };

        int passed = 0;


        for (int i = 0; i < testCases.length; i++) {
            String input    = (String)  testCases[i][0];
            boolean expected = (boolean) testCases[i][1];

            boolean result  = isValid(input);
            boolean ok      = result == expected;

            if (ok) passed++;

            System.out.printf("Test %d | %-10s  →  %-5s  expected: %-5s  %s%n",
                    i + 1,
                    "\"" + input + "\"",
                    result,
                    expected,
                    ok ? "✓" : "✗ FAIL");
        }

        System.out.printf("%n%d / %d tests passed%n", passed, testCases.length);
    }
        public static boolean isValid(String input) {
            Stack<Character> stack = new Stack<>();
            Map<Character, Character> mapping = new HashMap<>();
            mapping.put(')', '(');
            mapping.put('}', '{');
            mapping.put(']', '[');

            for(char c : input.toCharArray()) {
                if(mapping.containsValue(c)) {
                    stack.push(c);
                }else if(mapping.containsKey(c)) {
                    if(stack.isEmpty() || mapping.get(c) != stack.pop()) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();

        }
}
