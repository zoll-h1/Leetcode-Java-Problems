package Problems;

public class Palindrome {
    public static String getTitle() {
        return "9. Palindrome Number";
    }
    public static String getQuestion() {
        return """
                 Given an integer x, return true if x is a palindrome, false otherwise.
                 A number is a palindrome if it reads the same forward and backward.
                 Example 1:  x = 121   →  true   (121 = 121 reversed)
                 Example 2:  x = -121  →  false  (-121 reversed = 121-, not equal)
                 Example 3:  x = 10    →  false  (10 reversed = 01)
                 Difficulty: Easy  |  Topic: Math
                """;
    }
    public static String getCode() {
        return """
                class Solution {
                public boolean isPalindrome(int x) {
                 if(x < 0) {
                  return false;
                 }
                int num = x;
                long rev = 0;
                 while (num != 0) {
                   rev = rev * 10 + num % 10;
                   num = num / 10;
                   }
                      return (rev == x);
                 }
                }
                """;
    }
    public static void solve() {
        int[] Testcases = {121, -121, 10, 0, 1221};
        for(int x : Testcases) {
            boolean result = isPalindrome(x);
            System.out.printf("Input: x = %-6d  →  %-5s  %s%n",
                    x,
                    result,
                    result ? "✓" : "✗"
                    );
        }
    }
    // ---- My Solution ----
    public static boolean isPalindrome(int x) {
                if(x < 0) {
                    return false;
                }
                int num = x;
                long rev = 0;
                while (num != 0) {
                    rev = rev * 10 + num % 10;
                    num = num / 10;
                }
                return (rev == x);
            }
        }


