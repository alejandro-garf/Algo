import java.util.HashMap;


public class Source {

// This is a helper function that starts the Fibonacci calculation 
// using memoization by creating a new empty HashMap to store results.
// It allows users to call fib(n) without needing to manage the memo map themselves.

    public static int fib(int n){
        return(fib(n, new HashMap<>()));
    }

    // Actual memorzation technique to solve problme in 0(n)

    public static int fib(int n, HashMap<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memo.containsKey(n)){  // Checks if Hasmap already contains key value pair for the integer
            return memo.get(n); // If it does it returns it in O(1) lookup time
        }

        int result = fib(n - 1, memo) + fib(n - 2, memo); // Stores result value 
        memo.put(n, result); // Puts new key value pair in hash map 
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Fibonacci(10) = " + fib(10));
    }
}
