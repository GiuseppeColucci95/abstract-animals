package org.lessons.java.interfaces;

public class Eagle extends Animal implements IFlying {

  @Override
  public void verso() {
    System.out.println("Uaw uaw!");
  }

  @Override
  public void mangia() {
    System.out.println("Eagle is eating something!");
  }

  @Override
  public void fly() {
    System.out.println("Eagle is flying!");
  }
}
