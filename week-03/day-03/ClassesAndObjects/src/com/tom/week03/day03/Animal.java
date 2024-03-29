package com.tom.week03.day03;

public class Animal {
  private int hunger;
  private int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }

  public int getHunger() {
    return hunger;
  }
}
