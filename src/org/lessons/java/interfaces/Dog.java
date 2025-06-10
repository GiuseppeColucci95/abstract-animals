package org.lessons.java.interfaces;

public class Dog extends Animal implements ISwimming {

  @Override
  public void verso() {
    System.out.println("Bau bau!");
  }

  @Override
  public void mangia() {
    System.out.println("Dog is eating red meat!");
  }

  @Override
  public void swim() {
    System.out.println("Dog is swimming!");
  }
}
