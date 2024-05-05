package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FibonacciUtil fibonacciUtil = new FibonacciUtil();
        System.out.println(fibonacciUtil.getFibonacci(6));
        System.out.println(fibonacciUtil.getFibonacciWithRecursion(6));
        System.out.println(fibonacciUtil.getFibonacciWithDP(6));
    }
}