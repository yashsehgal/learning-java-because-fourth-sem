import java.util.*;

public class StringOperations {
	public static String[] generateUsername(String usernameString[], boolean isUsernameStringValid) {
		isUsernameStringValid=false;
		if (usernameStringValid) {
		       	isUsernameStringValid=false; 
		} else {
			isUsernameStringValid=true;
		}
		if (isUsernameStringValid) {
			for (int count = 0; count <= usernameString.length; count++) {
				if (usernameString[count] == usernameString[count].toUpperCase()) {
					usernameString[count].toLowerCase();
				}
				if (usernameString[count] == (String)" " || usernameString[count] == (String)"\t") {
					usernameString[count] = (String)"-";
				} 
			}
		}
		return (String[])usernameString;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// taking test input
		String testInput = "Yash Sehgal is an amaZing Developer. A really cool DesigNER";
		System.out.println("Test Input: " + testInput);
		String generatedUsernameResult = generateUsername(testString, false);
		System.out.println("Test results: " + generatedUsernameResult);
	}
}
