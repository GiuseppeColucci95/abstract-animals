package org.lessons.java.interfaces;

public class Main {

  public static void letFly(IFlying animal) {
    animal.fly();
  }

  public static void letSwim(ISwimming animal) {
    animal.swim();
  }

  public static void main(String[] args) {

    Dog dog = new Dog();
    Dolphin dolphin = new Dolphin();
    Eagle eagle = new Eagle();
    Bird bird = new Bird();

    IFlying eagleFlying = new Eagle();
    IFlying birdFlying = new Bird();
    ISwimming dolphinSwimming = new Dolphin();
    ISwimming dogSwimming = new Dog();

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

    letFly(eagleFlying);
    letFly(birdFlying);
    letSwim(dogSwimming);
    letSwim(dolphinSwimming);

    dogSwimming.swim();
  }
}
