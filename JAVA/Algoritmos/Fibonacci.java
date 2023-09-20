public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("O " + n + " numero fibonacci é: " + fibonacci(n));
    }
}
