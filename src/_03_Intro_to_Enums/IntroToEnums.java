package _03_Intro_to_Enums;

import java.util.Random;

import javax.swing.JOptionPane;

enum Elements {

	/*
	 * enums (short for enumerated type) are a class-like structure that can contain
	 * a set of specific data values.
	 */

	// Note: Every entry must be unique.
//	AIR (0), EARTH (1), FIRE(2), METAL(3), WATER(4), WOOD(5);
	/*int value;
	Elements (int value){
		this.value=value;
	}*/
}

public class IntroToEnums {
	//public static int celciusTemp;
	
	//static = do not need to initialize object to use it

	public static void main(String[] args) {
	/*	Elements air = Elements.AIR;
		System.out.println(air.value);
		if(air==Elements.AIR) {
			System.out.println("hi");
		}
		*/
		
		// 1. In your package explorer, create a new enum file called StatesOfMatter.
		// Hint: This is very similar to how you create a new class file.

		// 2. Give the enum the following values:
		// SOLID, LIQUID, GAS

		// 3. Create an array of StatesOfMatter with all the values using .values().
		// Hint: Use "StatesOfMatter." as if it were a static method.
		StatesOfMatter[] statesOfMatter = StatesOfMatter.values();
		
		// 4. Ask the user for a state of matter.
		String input = JOptionPane.showInputDialog("Enter a state of matter");
		// 5. Iterate through the array and find what the user entered.
		// Hint: .name() or .toString
		for(int i = 0; i<statesOfMatter.length; i++) {
			if(statesOfMatter[i].toString().equalsIgnoreCase(input)) {
				System.out.println(statesOfMatter[i]);
				System.out.println(statesOfMatter[i].ordinal());
			}
		}
		// 6. Print outs its ordinal(order in the enum list)
		// Hint: .ordinal()

		// 7. Add a celsiusTemp member variable to StatesOfMatter.
		// Note: Make sure to encapsulate it.

		// 8. Give it a default value of the temperature each state occurs in water.
		// Hint: Gas = 100, Liquid(room temp) = 25.55, Solid = 0

		// Example
		// enum Months{
		//
		// JAN(31),FEB(28),MAR(31),APR(30),MAY(31),JUN(30),JUL(31),AUG(31),SEP(30),
		// OCT(31),NOV(30),DEC(31);
		//
		// int daysInMonth;
		//
		// private Months(int daysInMonth) {
		// this.daysInMonth = daysInMonth;
		// }

		// 9. Add a convertToFahrenheit method to StatesOfMatter
		// Hint: Return the conversion: F = (C * 9/5) + 32

		// 10. Create a variable of the StatesOfMatter type and initialize it randomly.
		
		Random ran = new Random();
		int x = ran.nextInt(3);
		StatesOfMatter state = statesOfMatter[x];
		switch(state) {
		case SOLID:
			System.out.println("sushi");
			break;
		
		case LIQUID:
			System.out.println("water");
			break;
			
		case GAS:
			System.out.println("helium");
			break;
			
		default:
			state = null;
			System.out.println("ERROR: Out of bounds from switch");
		
		}
		// 11. Print outs both of its temperatures.
		System.out.println(state + " Celcius: " + state.celciusTemp + ", Farenheit: " + state.convertToFahrenheit(state.celciusTemp));
		// 11. Create a switch statement that switches on the variable you created.
		// Note: When creating the cases, you can omit the "StatesOfMatter."
		// 12. For each case, print your favorite food or drink that uses that state.
		// e.g. Gas/Boiling for Pasta, Solid/Ice for Popsicles, Liquid for Soda

	}

}
