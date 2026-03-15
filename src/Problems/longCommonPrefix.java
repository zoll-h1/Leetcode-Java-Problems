package Problems;

import java.util.Arrays;

public class longCommonPrefix {
    public static String getTitle() {
        return "14. Longest Common Prefix";
    }

    public static String getQuestion() {
        return """
                Write a function to find the longest common prefix string amongst an array of strings.
                If there is no common prefix, return an empty string "".
                Example 1:
                Input: strs = ["flower","flow","flight"]
                Output: "fl"
                Example 2:
                Input: strs = ["dog","racecar","car"]
                Output: ""
                Explanation: There is no common prefix among the input strings.
                Difficulty: Easy  |  Topic: Math
                """;
    }

    public static String getCode() {
        return """
                class Solution {
                    public String longestCommonPrefix(String[] strs) {
                        StringBuilder ans = new StringBuilder();
                        Arrays.sort(strs);
                        String first = strs[0];
                        String last = strs[strs.length-1];
                        for(int i = 0; i < Math.min(first.length(), last.length()); i++) {
                        if(first.charAt(i) != last.charAt(i)) {
                            return ans.toString();
                        }
                        ans.append(first.charAt(i));
                      }
                      return ans.toString();
                    }
                }
                """;
    }

    public static void solve() {
        Object[][] testCases = {
                {new String[]{"flower", "flow", "flight"},  "fl"},
                {new String[]{"dog", "racecar", "car"},      ""},
                {new String[]{"interview", "inter", "internal"}, "inter"},
                {new String[]{"a"},                          "a"},
        };

        int passed = 0;

        for (int i = 0; i < testCases.length; i++) {
            String[] input    = (String[]) testCases[i][0];
            String expected   = (String)   testCases[i][1];
            String result     = longPrefix(input);
            boolean ok        = result.equals(expected);

            if (ok) passed++;

            System.out.printf("Test %d | input: %-30s  →  \"%-8s\"  expected: \"%-8s\"  %s%n",
                    i + 1,
                    Arrays.toString(input),
                    result,
                    expected,
                    ok ? "✓" : "✗ FAIL");
        }

        System.out.printf("%n%d / %d tests passed%n", passed, testCases.length);
    }

    public static String longPrefix(String[] strs) {
                StringBuilder ans = new StringBuilder();
                Arrays.sort(strs);
                String first = strs[0];
                String last = strs[strs.length-1];
                for(int i = 0; i < Math.min(first.length(), last.length()); i++) {
                    if(first.charAt(i) != last.charAt(i)) {
                        return ans.toString();
                    }
                    ans.append(first.charAt(i));
                }
                return ans.toString();
            }
        }

