package modules.UserMethods;

import java.util.*;

public class CreateUser {
  String username, firstName, lastName, tagline, description, role;
  public CreateUser() {
    username = "@";
    firstName="@";
    lastName="@";
    tagline="@";
    description="@";
    role="@";
  }
  public static void setUsername(String _username) {
    this.username = _username;
  }
  public static String getUsername(void) {
    return this.username;
  }
  public static void setFirstName(String _firstName) {
    this.firstName = _firstName;
  }
  public static String getFirstName(void) {
    return this.firstName;
  }
  public static void setLastName(String _lastName) {
    this.lastName = _lastName;
  }
  public static String getLastName(void) {
    return this.lastName;
  }
  public static void setTagline(String _tagline) {
    this.tagline = _tagline;
  }
  public static String getTagline(void) {
    return this.tagline;
  }
  public static void setDescription(String _description) {
    this.description = _description;
  }
  public static String getDescription(void) {
    return this.description;
  }
  public static void setRole(String _role) {
    this.role = _role;
  }
  public static String getRole(void) {
    return this.role;
  }
  public static void main(String args[]) {
    System.out.println('[CLASS LOG <CREATE-USER OBJECT CREATED>]');
  }
}