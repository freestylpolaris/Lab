/* 
 * Modified on <1/22/2013>
 * 
 * <Rkhickm>
 * Course: IT 168
 * Lecture section: <4>
 * Instructor: <Professor Matsuda>
 * Lab section: <5>
 * Instructor: <Erickson>
 */

/** 
 * This program is a test to demonstrate my knowledge of how to find
 * errors in a program that involves String variables as well as
 * demonstrating my knowledge of utilizing the string Sytem.out.print
 * 
 * &author <Ryan Hickman>
 */

// This is the class name.

public class ErrorsProgram {

	// This is my main method.
	
	public static void main(String[] args) {

		// These are a set of String variables that will
		// be utilized in the below statements.
		
		String responseYes = "Yes I can!";
		String responseNo = "No I cannot!";
		String responseSure = "Sure!";
		String student = "ITK 168 STUDENT";
		
		// Everything below is the set of strings that will print out whatever is contained in them
		// onto the user's screen.
		
		// This will print out the statement "Hello - ITK 168 STUDENT". First it prints out 
		// "Hello" then the statement "ITK 168 STUDENT" is added from the above String variable.
		System.out.println("Hello - " + student);
		
		// This will print out the statement "Can you find all the errors in this program?".
		System.out.println("Can you find all the errors in this program?");
		
		// This will print out: "Sure" by using the above String variable.
		System.out.println(responseSure);
		
		// This will print out: "Can you fix them and make the program run correctly?".
		System.out.println("Can you fix them and make the program run correctly?");
		
		// This will print out "Yes I can!" by using the above string variable.
		System.out.println(responseYes);
	
	}
}
