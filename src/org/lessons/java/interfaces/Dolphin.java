package org.lessons.java.interfaces;

public class Dolphin extends Animal implements ISwimming {

  @Override
  public void verso() {
    System.out.println("Cri cri!");
  }

  @Override
  public void mangia() {
    System.out.println("Dolphin is eating fish!");
  }

  @Override
  public void swim() {
    System.out.println("Dolphin is swimming!");
  }
}
