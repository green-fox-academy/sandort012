package com.tom.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalFinance {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(500, 1000, 1250, 175, 800, 120);

    int sum = 0;
    for (int num : list) {
      sum += num;
    }
    System.out.println("We spent: " + sum);

    int greatestExpense = list.get(0);
    for (int num : list) {
      if (num > greatestExpense) {
        greatestExpense = num;
      }
    }
    System.out.println("The greatest expense is: " + greatestExpense);

    int cheapestExpense = list.get(0);
    for (int num : list) {
      if (num < cheapestExpense) {
        cheapestExpense = num;
      }
    }
    System.out.println("The cheapest expense is: " + cheapestExpense);

    System.out.println("The average is: " + sum / list.size());
  }
}
