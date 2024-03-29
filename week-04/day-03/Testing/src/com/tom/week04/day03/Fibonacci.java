package com.tom.week04.day03;

public class Fibonacci {
  public int fibonacci(int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    } else if (n <= 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
