package Problems;

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
               
               """;
    }
    public static void solve() {
        String[] testCases = {"III", "LVIII"};
        for(String s : testCases) {
            int result = toInteger(s);
            System.out.printf("Input : x = %s -> %d" , s, result);
        }
    }
    public static int toInteger(String s) {
        return 1;
    }
}
