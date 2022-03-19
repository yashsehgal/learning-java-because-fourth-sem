import java.io.*;
import java.util.*;

class SpaceStone {
  static boolean isSpaceStoneAdded = false;
  public SpaceStone() {
    System.out.println("Space Stone added to the universe");
  }
  public static void addSpaceStone(boolean isPossibleToAdd) {
    if (isPossibleToAdd) {
      isSpaceStoneAdded = true;
    }
  }
}

class RealityStone {
  static boolean isRealityStoneAdded = false;
  public RealityStone() {
    System.out.println("Reality Stone added to the univervse");
  }
  public static void addRealityStone(boolean isPossibleToAdd) {
    if (isPossibleToAdd) {
      isRealityStoneAdded = true;
    }
  }
};

class PowerStone {
  static boolean isPowerStoneAdded = false;
  public PowerStone() {
    System.out.println("Power Stone added to the universe");
  }
  public static void addPowerStone(boolean isPossibleToAdd) {
    if (isPossibleToAdd) {
      isPowerStoneAdded = true;
    }
  }
}

class MindStone {
  static boolean isMindStoneAdded = false;
  public MindStone() {
    System.out.println("Mind Stone added to the universe");
  }
  public static void addMindStone(boolean isPossibleToAdd) {
    if (isPossibleToAdd) {
      isMindStoneAdded = true;
    }
  }
}

class TimeStone {
  static boolean isTimeStoneAdded = false;
  public TimeStone() {
    System.out.println("Time Stone added to the universe");
  }
  public static void addTimeStone(boolean isPossibleToAdd) {
    if (isPossibleToAdd) {
      isTimeStoneAdded = true;
    }
  }
}

class SoulStone {
  static boolean isSoulStoneAdded = false;
  public SoulStone() {
    System.out.println("Soul Stone added to the universe");
  }
  public static void addSoulStone(boolean isPossibleToAdd) {
    if (isPossibleToAdd) {
      isSoulStoneAdded = true;
    }
  }
}

class InfinityGauntlet extends SpaceStone, RealityStone, PowerStone, MindStone, TimeStone, SoulStone {
  static String owner = new String("None");
  public InfinityGauntlet() {
    System.out.println("Infinity Gauntlet has been created");
  }
  public static void setOwner(String ownerName) {
    if (ownerName != null || ownerName != "") {
      owner = ownerName;
      switch (owner) {
        case "Tony Stark":
        case "Iron Man":
          System.out.println("I am, Iron Man!");
        break;
        case "Thanos":
          System.out.println("i am inevitable!");
        break;
        default:
          System.out.println("Stones are mine now! I will use them as paper-weights :}");
        break;
      }
    }
  }
}

public class MultipleInheritance {
  public static void main(String args[]) {
    InfinityGauntlet infinityGauntlet = new InfinityGauntlet();
    infinityGauntlet.setOwner("Loki");
    infinityGauntlet.setOwner("Thanos");
    infinityGauntlet.setOwner("Iron Man");
  }
}
