package org.lessons.java.interfaces;

public class Dog extends Animal {

  @Override
  public void verso() {
    System.out.println("Bau bau!");
  }

  @Override
  public void mangia() {
    System.out.println("Dog is eating red meat!");
  }
}
