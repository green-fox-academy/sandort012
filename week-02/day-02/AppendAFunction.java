package com.tom.week02.day02;

public class AppendAFunction {
  public static void main(String[] args) {
    //  Create the usual class wrapper and main method on your own

    // - Create a string variable named `typo` and assign the value `Chinchill` to it
    // - Write a function called `appendA()` that gets a string as an input,
    //   appends an 'a' character to its end and returns the modified string
    //
    // - Print the result of `appendA(typo)`

    String typo = "Chinchill";
    System.out.println(appendA(typo));
  }

  private static String appendA(String str) {
    return str.concat("a");
  }
}
