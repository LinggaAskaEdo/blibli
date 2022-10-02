public class PalindromeExample {
    public static void main(String[] args) {
        // Sample integer
        int r, sum = 0, temp;
        int n = 123;// It is the number variable to be checked for palindrome

        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            System.out.println("r: " + r);
            sum = (sum * 10) + r;
            System.out.println("sum: " + sum);
            n = n / 10;
            System.out.println("n: " + n);
        }
        if (temp == sum)
            System.out.println(temp + " is palindrome number ");
        else
            System.out.println(temp + " is not palindrome");

        // Sample string
        String original = "MADAM";
        String reverse = "";
        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equalsIgnoreCase(reverse)) {
            System.out.println(original + " is palindrome alphabet");
        } else {
            System.out.println(original + " is not palindrome alphabet");
        }
    }
}
