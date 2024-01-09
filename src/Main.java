public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));  // true
        System.out.println(isPalindrome(707));    // true
        System.out.println(isPalindrome(11212));  // false
        System.out.println(isPerfectNumber(6));   // true
        System.out.println(isPerfectNumber(28));  // true
        System.out.println(isPerfectNumber(5));   // false
        System.out.println(isPerfectNumber(-1));  // false
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
    public static boolean isPerfectNumber(int number) {
        if(number<0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;

    }
}