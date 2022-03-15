package modules;

import java.util.*;

public class Parent {
    public Parent() {
        System.out.println("Parent Object has been created!");
    }
    public Parent(name, age, height) {
        String parentName = (name ? name : ""); 
        int parentAge = (age ? age = 0);
        int parentHeight = (height ? height : 0);
    }
    public static void setParentName(String parentName) {
        if (!parentName) return;
        this.parentName = parentName;
    }
    public static String getParentName(void) {
        return this.parentName;
    }
    public static void setParentAge(int parentAge) {
        this.parentAge = parentAge;
    }
    public static int getParentAge(void) {
        return this.parentAge;
    }
    public static void setParentHeight(int parentHeight) {
        this.parentHeight = parentHeight;
    }
    public static int getParentHeight(void) {
        return this.parentHeight;
    }
    public static void main(String args[]) {
        System.out.println("creating methods for parent object")
    }
}

public class Child extends Parent {
    public Child() {
        System.out.println("Child Object has been created!");
    }
    public Child(name, age, height) {
        String childName = (name ? name : ""); 
        int childAge = (age ? age = 0);
        int childHeight = (height ? height : 0);
    }
    public static void setChildName(String childName) {
        this.childName = childName;
    }
    public static String getChildName(void) {
        return this.childName;
    }
    public static void setChildAge(int childAge) {
        this.childAge = childAge;
    }
    public static int getChildAge(void) {
        return this.childAge;
    }
    public static void setChildHeight(int childHeight) {
        this.childHeight = childHeight;
    }
    public static int getChildHeight(void) {
        return this.childHeight;
    }
}; 
