
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

	@Override
	public void requestRecipeName() {
		StdOut.println("____________________\r\n");
		StdOut.println("Enter the recipe name:\r\n");
	}

	@Override
	public String getRecipeName() {
		String input;
		
		StdOut.print(">> ");
		input = StdIn.readString();
		StdOut.println("\r\n");
		return input;
	}

	@Override
	public void requestIngredientName() {
		StdOut.println("____________________\r\n");
		StdOut.println("Enter the ingredient name.");
		StdOut.println("Enter 0 when finished.\r\n");
	}

	@Override
	public String getString() {
		String input;
		
		StdOut.print(">> ");
		input = StdIn.readString();
		StdOut.println("\r\n");
		return input;
	}

	@Override
	public void requestIngredientAmount() {
		StdOut.println("____________________\r\n");
		StdOut.println("Enter the ingredient amount.");
		StdOut.println("Enter value/unit.");
		StdOut.println("For example \'1 cup\'");
	}	
	
	
}
