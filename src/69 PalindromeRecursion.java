import java.util.Scanner;


class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome checker\n");
        System.out.print("Enter the string that you want to check: ");
        String str = input.next();
        System.out.println("your string is "
                + ((isPalindrome(str) ? "Palindrome"
                : "Not palindrome")));
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }
         String newStr = str.substring(1,lastPos);
        return isPalindrome(newStr);
    }
}