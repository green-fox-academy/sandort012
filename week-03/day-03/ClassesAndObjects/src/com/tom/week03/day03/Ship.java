package com.tom.week03.day03;

import java.util.ArrayList;

public class Ship {
  public static final int MAX_PIRATES = 113;
  private Pirate captain;
  private ArrayList<Pirate> crew = new ArrayList<>();
  private boolean isDestroyed = false;

  public void fillShip() {
    captain = new Pirate();
    int rand = (int) ((Math.random() * (MAX_PIRATES - 1)) + 1);
    for (int i = 0; i < rand; i++) {
      crew.add(new Pirate());
    }
  }

  public int alivePirates() {
    int sum = 0;
    for (Pirate pirate : crew) {
      if (pirate.isAlive) {
        sum++;
      }
    }
    return sum;
  }

  public boolean battle(Ship ship) {
    int score = alivePirates() + captain.getAlcoholLevel();
    int enemy = ship.alivePirates() + ship.getCaptain().getAlcoholLevel();

    if (score > enemy) {
      party();
      ship.killCrew();
      return true;
    } else {
      ship.party();
      killCrew();
      return false;
    }
  }

  public void party() {
    for (Pirate pirate : crew) {
      drinkRandom(pirate);
    }
    drinkRandom(captain);
  }

  public void killCrew() {
    int rand = (int) (Math.random() * alivePirates());
    for (Pirate pirate : crew) {
      if (pirate.isAlive && rand > 0) {
        pirate.die();
        rand--;
      }
    }
  }

  public Pirate getCaptain() {
    return captain;
  }

  public boolean isDestroyed() {
    return isDestroyed;
  }

  public void destroy() {
    isDestroyed = true;
  }

  @Override
  public String toString() {
    return "The captain has consumed " + captain.getAlcoholLevel() + " rum(s) and is " +
        (captain.isAlive ? "alive" : "dead") + ". There are " +
        alivePirates() + " pirates alive.";
  }

  private void drinkRandom(Pirate pirate) {
    int rand = (int) ((Math.random() * (10 - 1)) + 1);
    while (rand > 0) {
      pirate.drinkSomeRum();
      rand--;
    }
  }
}
