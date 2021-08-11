//VariableTest.java is a class made to test how instance variables in java work/
//Just the real Lord Ala-Vijana playing around

//import Scanner so that you can use scanner to take user input
import java.util.Scanner;

public class VariableTest {

	//intialize the class with some variables that have values already 

	int x = 10;
	int y = 20;
	float z = 5.5555f;
	float z1 = 25.34290f;

	public void integerAddition(){
		// little method to take user input and added to the existing 
		// instance variables

		//create new instance of Scanner so you can read user input

		Scanner scanIn = new Scanner(System.in);

		System.out.println("Enter a new int to be added to the number 10:");

		//read in the value that the program user types with .nextInt method

		int x1 = scanIn.nextInt();

		int a1 = x + x1;
		
		System.out.println("The results of "+x1+" added to ten equal to " +a1);
		
	}

	public void integerSubtraction(){
		
		// create new instance of scanner so you can read in user input.

		Scanner scanIn = new Scanner(System.in);

		System.out.println("Enter a number to be subtracted from 20:");

		// read in the user input from scanner.nextInt() method;

		int y1 = scanIn.nextInt();

		//perform calculation

		int b1 = y - y1;

		System.out.println("The results of "+y1+" subtracted from 20 are equal to "+b1);

	}

	public static void main(String []args){
		//create 3 instances of the class VariableTest
		//print out the instance variables to verify that the instance variables are the same
		// value for each of the instance variables accross the different objects

		VariableTest object1 = new VariableTest();

		System.out.println("Welcome to the program Variable Test, this program was written to give me some practoce with instance variables, This program will now initialize the first object.");

		//print out the values from object1 to verify that the variables are initialized the same and can
		// be used across different objects

		System.out.println("Value of x for the first object: " +object1.x);
		System.out.println("Value of y for the first object: " +object1.y);
		

		// call the addition and subtraction methods to verify that the instance variables are availible
		// inside the methods

		object1.integerAddition();
		object1.integerSubtraction();

		// now try it with a different object to verify that the instance variables values can be manipulated
		// differently by different objects

		VariableTest object2 = new VariableTest();

		System.out.println("We have now inittalized object 2, this is to verify that you can manipulate instance variables with the same value differently across different objects.");
		
		System.out.println("Value of x for the second object: " + object2.x);
		System.out.println("Value of y for the second object: " + object2.y);

		// now use the addition and subtraction methods for object2 to verify that different instance variables can be manipulated differently accross different objects

		object2.integerAddition();
		object2.integerSubtraction();

		System.out.println("That should verify some of your questions about instance variables across different objects");
		
	}

}

