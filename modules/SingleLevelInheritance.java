
import java.io.*;
import java.util.*;

class Parent {
  static String parentName = new String("None");
  static int parentAge = -1; 
  static String parentSkinColor = new String("None");
  static String parentEyeColor = new String("None");
  static int parentHeight = -1;
  public Parent() {
    System.out.println("New Parent created");
  }
  public static void createParent(String _parentName, int _parentAge, String _parentSkinColor, String _parentEyeColor, int _parentHeight) {
    parentName = _parentName;
    parentAge = _parentAge;
    parentSkinColor = _parentSkinColor;
    parentEyeColor = _parentEyeColor;
    parentHeight = _parentHeight;
    System.out.println("New Parent properties are now defined.");
    System.out.println("Parent Name: " + parentName);
    System.out.println("Parent Age: " + parentAge);
    System.out.println("Parent Skin Color: " + parentSkinColor);
    System.out.println("Parent Eye Color: " + parentEyeColor);
    System.out.println("Parent Height: " + parentHeight);
  }
  public static void main(String args[]) {
    System.out.println("Parent Methods are accessible now");
  }
}

class Child extends Parent {
  static String childName = new String("None");
  static int childAge = -1;
  static String childSkinColor = new String("None");
  static String childEyeColor = new String("None");
  static int childHeight = -1;
  public Child() {
    System.out.println("New Child created");
  }
  public static void createChild(String _childName, int _childAge, String _childSkinColor, String _childEyeColor, int _childHeight) {
    childName = _childName;
    childAge = _childAge;
    childSkinColor = _childSkinColor;
    childEyeColor = _childEyeColor;
    childHeight = _childHeight;
    System.out.println("New Child properties are now defined.");
    System.out.println("Child Name: " + childName);
    System.out.println("Child Age: " + childAge);
    System.out.println("Child Skin Color: " + childSkinColor);
    System.out.println("Child Eye Color: " + childEyeColor);
    System.out.println("Child Height: " + childHeight);
  }
  public static void main(String args[]) {
    System.out.println("Child Methods are accessible now");
  }
}

public class SingleLevelInheritance {
  public static void main(String args[]) {
    Child ultron = new Child();
    ultron.createChild("Ultron", 1, "Silver and Red", "Red", 8);
    ultron.createParent("Tony Stark", 35, "Peach (Light)", "Blue", 6);
  }
}
