package com.tom.week02.day02;

public class Greeting {
  public static void main(String[] args) {
    //  From now on, create the usual class wrapper
    //  and main method on your own

    // - Create a string variable named `al` and assign the value `Green Fox` to it
    // - Create a function called `greet()` that greets it's input parameter
    //     - Greeting is printing e.g. `Greetings dear Green Fox`
    // - Greet `al`

    String al = "Green Fox";
    greet(al);
  }

  private static void greet(String name) {
    System.out.println("Greetings dear " + name);
  }
}
