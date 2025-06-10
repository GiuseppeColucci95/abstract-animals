package org.lessons.java.interfaces;

public class Main {
  public static void main(String[] args) {

    Dog dog = new Dog();
    Dolphin dolphin = new Dolphin();
    Eagle eagle = new Eagle();
    Bird bird = new Bird();

    dog.verso();
    dog.mangia();
    dog.dormi();

    dolphin.verso();
    dolphin.mangia();
    dolphin.dormi();

    eagle.verso();
    eagle.mangia();
    eagle.dormi();

    bird.verso();
    bird.mangia();
    bird.dormi();

  }
}
