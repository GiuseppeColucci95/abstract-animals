package org.lessons.java.interfaces;

public class Dolphin extends Animal {

  @Override
  public void verso() {
    System.out.println("Cri cri!");
  }

  @Override
  public void mangia() {
    System.out.println("Dolphin is eating fish!");
  }

}
