package Problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static String getTitle() {
        return "13. Roman To Integer";
    }
    public static String getQuestion() {
        return """
               Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
               For example, 2 is written as II in Roman numeral, just two ones added together. 
               12 is written as XII, which is simply X + II. 
               The number 27 is written as XXVII, which is XX + V + II.
               Example 1:  Input: s = "III" -> Output: 3
               Explanation: III = 3.
               """;
    }
    public static String getCode() {
        return """
                class Solution {
                    public int romanToInt(String s) {
                        int res = 0;
                        Map<Character, Integer> roman = new HashMap<>();
                        roman.put('I', 1);
                        roman.put('V', 5);
                        roman.put('X', 10);
                        roman.put('L', 50);
                        roman.put('C', 100);
                        roman.put('D', 500);
                        roman.put('M', 1000);
                        for(int i = 0; i < s.length() - 1; i++) {
                            if(roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                                res -= roman.get(s.charAt(i));
                            }else {
                                res += roman.get(s.charAt(i));
                            }
                        }
                
                        return res + roman.get(s.charAt(s.length() - 1));   \s
                    }
                }
               """;
    }
    public static void solve() {
        // { input, expected }
        Object[][] testCases = {
                {"III",      3},
                {"LVIII",    58},
                {"IV",       4},
                {"IX",       9},
                {"XLII",     42},
                {"XCIX",     99},
                {"CDXLIV",   444},
                {"MCMXCIV",  1994},
                {"MMXXVI",   2026},
        };

        int passed = 0;

        for (Object[] tc : testCases) {
            String input    = (String) tc[0];
            int expected    = (int)    tc[1];
            int result      = toInteger(input);
            boolean ok      = result == expected;

            if (ok) passed++;

            System.out.printf("%-12s  →  %-6d  expected: %-6d  %s%n",
                    input,
                    result,
                    expected,
                    ok ? "✓" : "✗ FAIL");
        }

        System.out.printf("%n%d / %d tests passed%n", passed, testCases.length);
    }
    public static int toInteger(String s) {
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        for(int i = 0; i < s.length() - 1; i++) {
            if(roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
            }else {
                res += roman.get(s.charAt(i));
            }
        }

        return res + roman.get(s.charAt(s.length() - 1));
    }
}
