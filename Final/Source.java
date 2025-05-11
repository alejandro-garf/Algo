public class Source {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int result = fib(10); // Example: get the 10th Fibonacci number
        System.out.println("Fibonacci(10) = " + result);
    }
}
