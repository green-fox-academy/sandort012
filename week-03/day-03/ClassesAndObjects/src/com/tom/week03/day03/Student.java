package com.tom.week03.day03;

public class Student {
  public void learn() {
    System.out.println("the student is actually learning");
  }

  public void question(Teacher teacher) {
    teacher.giveAnswer();
  }
}
