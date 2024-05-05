package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FibonacciUtil {
    private final Map<Integer, Long> memo = new HashMap<>();
    {
        memo.put(0, 0L);
        memo.put(1, 1L);
    }

    /* Fibonacci number with iteration method
       Time Complexity: O(n)
       Auxiliary Space: O(n)
     */
    public long getFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n < 2) {
            return n;
        }

        int first = 0;
        int second = 1;

        for (int i = 0; i < n-1 ; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }

    /* Fibonacci number with recursion method
       Time Complexity: O(2^n)
       Auxiliary Space: O(n)
     */
    public long getFibonacciWithRecursion(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 1 || n == 0) {
            return n;
        }

        return getFibonacciWithRecursion(n-1) + getFibonacciWithRecursion(n-2);
    }

    /* Fibonacci number with dynamic programing.
       Time Complexity first time (worst): O(2^n) and subsequent calls(best): O(n)
       Auxiliary Space:  O(n)
    */
    public long getFibonacciWithDP(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n < 2) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long result = getFibonacciWithDP(n-1) + getFibonacciWithDP(n-2);
        memo.put(n, result);
        return result;
    }
}
