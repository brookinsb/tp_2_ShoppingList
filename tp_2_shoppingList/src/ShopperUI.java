
import java.util.ArrayList;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class ShopperUI implements IShopperUI
{

	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void displayGreeting() {
		StdOut.println("Hello.  Welcome to Meal Planner.\r\n");
		
	}

	@Override
	public void displayMenuOptions() {
		
		StdOut.println("____________________\r\n");
		StdOut.println("Select an task:\r\n");
		StdOut.println("1 - Enter a new Recipe.");
		StdOut.println("2 - Plan meals.");
		StdOut.println("3 - Create list");
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
		input = scanner.nextLine();
		StdOut.println("\r\n");
		return input;
	}

	@Override
	public void requestIngredientAmount() {
		StdOut.println("____________________\r\n");
		StdOut.println("Enter the ingredient amount.");
		StdOut.println("Enter value-unit.");
		StdOut.println("For example \'1-cup\'");
	}

	@Override
	public void requestWeekStartingDay() {
		StdOut.println("____________________\r\n");
		StdOut.println("Enter the starting Day for menu planning.");
		StdOut.println("1-Sun, 2-Mon, 3-Tue, 4-Wed, 5-Thu, 6-Fri, 7-Sat\r\n");
		
		
	}

	@Override
	public void displayRecipeName(ArrayList<Recipe> recipeList) {
		StdOut.println("____________________\r\n");
		for (int i = 0; i < recipeList.size(); i++) {
			int j = i+1;
			StdOut.println(j + ". " + recipeList.get(i).getName() );
			
		}
		
	}

	@Override
	public void requestRecipesForDay(int day) {
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		StdOut.println("____________________\r\n");
		StdOut.println("Enter recipes for " + days[day-1]);
		
	}

	@Override
	public int getRecipeNumber() {
		StdOut.println(">>");
		return scanner.nextInt();
	}

	@Override
	public void displayIOError() {
		StdOut.println("*******************");
		StdOut.println("IO Exception");
		
	}	
	
	
}
