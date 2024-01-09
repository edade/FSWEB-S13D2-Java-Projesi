public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));  // true
        System.out.println(isPalindrome(707));    // true
        System.out.println(isPalindrome(11212));  // false
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        String strNumber = Integer.toString(number);
        int length = strNumber.length();

        for (int i = 0; i < length / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;

    }
}