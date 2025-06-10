package org.lessons.java.interfaces;

public class Bird extends Animal implements IFlying {

  @Override
  public void verso() {
    System.out.println("Cip cip!");
  }

  @Override
  public void mangia() {
    System.out.println("Bird is eating insects!");
  }

  @Override
  public void fly() {
    System.out.println("Bird is flying!");
  }
}
