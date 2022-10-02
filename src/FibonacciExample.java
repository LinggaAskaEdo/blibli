public class FibonacciExample {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args) {
        // Sample 1
        int count = 10;
        System.out.print(n1 + " " + n2);
        printFibonacci(count - 2);
        System.out.println();

        // Sample 2
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // compute next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();

        // Sample 3
        n = 100;
        firstTerm = 0;
        secondTerm = 1;
        while (firstTerm <= n) {
            System.out.print(firstTerm + " ");

            // compute next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }

    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }
}
