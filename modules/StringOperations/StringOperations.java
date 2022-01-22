package modules.StringOperations;

import java.util.*;

public class StringOperations {
	public static void main(String args[]) {
		String testString[] = "This is a test string to validate operations";
		System.out.println("Test String in usage: " + testString);
		System.out.println("---------------------------------------------");
		System.out.println("Encoding method returns: " + encode(testString));
	}
	public static String encode(String test[]) {
		if (test != null) {
			for (int count = 0; count <= test.length; count++) {
				if (test[count] == test[count].toUpperCase()) {
					test[count] = test[count].toLowerCase();
				}
				if (test[count] == " " || test[count] == "\t") {
					test[count] = "-";
				}
			}
			System.out.println("> " + test);
			return "WORKING";
		}
		return "Test String Type is not valid";
	}
}