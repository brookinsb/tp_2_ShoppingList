
import java.util.Scanner;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class ShopperUI implements IShopperUI
{

	@Override
	public void displayGreeting() {
		StdOut.println("Hello.  Welcome to Meal Planner.\r\n");
		
	}

	@Override
	public void displayMenuOptions() {
		
		StdOut.println("____________________\r\n");
		StdOut.println("Select an task:\r\n");
		StdOut.println("1 - Enter a new Recipe.");
		StdOut.println("9 - Done.");
		
	}

	@Override
	public int getMenuOption() {
		int input;
		
		StdOut.print(">> ");
		input = StdIn.readInt();
		StdOut.println("\r\n");
		return input;
	}

	@Override
	public void displayInvalidMenuOption() {
		StdOut.println("Oops.  Not a valid input.  Try again.\r\n");
	}	
	
	
}
