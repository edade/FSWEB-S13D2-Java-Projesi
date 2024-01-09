public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));  // true
        System.out.println(isPalindrome(707));    // true
        System.out.println(isPalindrome(11212));  // false
        System.out.println(isPerfectNumber(6));   // true
        System.out.println(isPerfectNumber(28));  // true
        System.out.println(isPerfectNumber(5));   // false
        System.out.println(isPerfectNumber(-1));  // false
        System.out.println(numberToWords(123));    // "One Two Three"
        System.out.println(numberToWords(1010));   // "One Zero One Zero"
        System.out.println(numberToWords(-12));    // "Invalid Value"
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

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        StringBuilder words = new StringBuilder();
        int num = number;

        while (num > 0) {
            int digit = num % 10;
            words.insert(0, units[digit] + " ");
            num /= 10;
        }

        return words.toString().trim();

    }
}