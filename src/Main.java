import Problems.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            System.out.print("Choose a problem (0 to exit): ");
            String input = scanner.nextLine().trim();

            if (input.equals("0")) {
                System.out.println("\nBye! Keep grinding. 💪");
                break;
            }

            switch (input) {
                case "1" -> openProblem(scanner,
                        TwoSum.getTitle(),
                        TwoSum.getQuestion(),
                        TwoSum.getCode(),
                        () -> TwoSum.solve());
                // case "2" -> openProblem(scanner, Problem2_Xxx.getTitle(), ...);
                case "2" -> openProblem(scanner,
                        Palindrome.getTitle(),
                        Palindrome.getQuestion(),
                        Palindrome.getCode(),
                        () -> Palindrome.solve());
                case "3" -> openProblem(scanner,
                        RomanToInteger.getTitle(),
                        RomanToInteger.getQuestion(),
                        RomanToInteger.getCode(),
                        () -> RomanToInteger.solve());
                case "4" -> openProblem(scanner,
                        longCommonPrefix.getTitle(),
                        longCommonPrefix.getQuestion(),
                        longCommonPrefix.getCode(),
                        () -> longCommonPrefix.solve());
                case "5" -> openProblem(scanner,
                        validParentheses.getTitle(),
                        validParentheses.getQuestion(),
                        validParentheses.getCode(),
                        () -> validParentheses.solve());
                default -> System.out.println("\n  Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    // ── Reusable problem viewer ──────────────────────────
    private static void openProblem(Scanner scanner,
                                    String title,
                                    String question,
                                    String code,
                                    Runnable solve) {
        while (true) {
            System.out.println("\n" + "=".repeat(52));
            System.out.println("  " + title);
            System.out.println("=".repeat(52));
            System.out.println("  [1]  Show Question");
            System.out.println("  [2]  Show My Code");
            System.out.println("  [3]  Run Solution");
            System.out.println("  [0]  Back to Menu");
            System.out.println("=".repeat(52));
            System.out.print("Choose: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1" -> {
                    System.out.println("\n[ QUESTION ]");
                    System.out.println(question);
                }
                case "2" -> {
                    System.out.println("\n[ MY CODE ]");
                    System.out.println(code);
                }
                case "3" -> {
                    System.out.println("\n[ SOLUTION OUTPUT ]");
                    solve.run();
                }
                case "0" -> { return; } // back to main menu
                default  -> System.out.println("\n  Invalid choice.");
            }

            System.out.println("\nPress ENTER to continue...");
            scanner.nextLine();
        }
    }

    // ── Main menu ────────────────────────────────────────-
    private static void printMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║           LEETCODE PRACTICE - JAVA           ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("║  [1]  " + TwoSum.getTitle()
                + " ".repeat(45 - 7 - TwoSum.getTitle().length()) + " ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("║  [2]  " + Palindrome.getTitle()
                + " ".repeat(45 - 7 - Palindrome.getTitle().length()) + " ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("║  [3]  " + RomanToInteger.getTitle()
                + " ".repeat(45 - 7 - RomanToInteger.getTitle().length()) + " ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("║  [4]  " + longCommonPrefix.getTitle()
                + " ".repeat(45 - 7 - longCommonPrefix.getTitle().length()) + " ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("║  [5]  " + validParentheses.getTitle()
                + " ".repeat(45 - 7 - validParentheses.getTitle().length()) + " ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("║  [0]  Exit                                   ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.print("\n");
    }
}