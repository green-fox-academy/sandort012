package com.tom.week03.day05;

public class BunniesAgain {
  public static void main(String[] args) {
    // We have bunnies standing in a line,
    // numbered 1, 2, 3, 4, ...
    // The odd bunnies (1, 3, ...) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears,
    // because they each have a raised foot.
    // Recursively return the number of "ears" in
    // the bunny line 1, 2, ... n (without loops or multiplication).
    System.out.println(floppyEars(4));
  }

  private static int floppyEars(int n) {
    if (n == 1) {
      return 2;
    } else if (n % 2 == 0) {
      return 3 + floppyEars(n - 1);
    } else {
      return 2 + floppyEars(n - 1);
    }
  }
}