import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

import edu.princeton.cs.introcs.StdOut;

public class MealPrepper
{
	private ArrayList<Recipe> recipeList;
	private IShopperUI ui;
	private RecipeStorage rs;
	private ArrayList<Integer>[] weekRecipes = new ArrayList[7]; 
	private int startingDayOfWeek;
	private boolean weekListMade = false;

	
	public MealPrepper(IShopperUI ui, String fileName) {
		this.ui = ui;
		
		rs = new RecipeStorage(fileName);
		
		recipeList = rs.read();
		
	StdOut.println(recipeList.toString());
	}


	public void selectRecipes() {
		boolean done = false;

		ui.requestWeekStartingDay();
		startingDayOfWeek = getAndValidateDay();
		while (startingDayOfWeek == 0) {
			startingDayOfWeek = getAndValidateDay();
		}
		
		
		int day = startingDayOfWeek;
		while(!done) {
			ArrayList<Integer> dayRecipeNumbers = new ArrayList<>();
			ui.displayRecipeName(recipeList);
			ui.requestRecipesForDay(day);
			
			int recipeNumber = ui.getRecipeNumber();
			while (recipeNumber !=0) {
				dayRecipeNumbers.add(recipeNumber-1);
				recipeNumber = ui.getRecipeNumber();
			}
			
			weekRecipes[day-1] = dayRecipeNumbers;
			dayRecipeNumbers = new ArrayList<>();
			day = (day+1)==8 ? 1 : day+1; 
			
			if (day == startingDayOfWeek) {
				done = true;
				weekListMade = true;
			}
		}

	}


	private int getAndValidateDay() {
		int day = 0;
		String weekStartString = ui.getString();
		try {
			day = Integer.parseInt(weekStartString);
		} catch (Exception e) {
			day = 0;
		}
		return day;
	}
	
	public void writeShoppingList() throws IOException {
		ShoppingList sl = new ShoppingList();
		ArrayList<Ingredient> shoppingList = new ArrayList<>();
		boolean done;
		
	    FileWriter fileWriter = new FileWriter("MealPlanner.txt");
	    PrintWriter printWriter = new PrintWriter(fileWriter, true);
	    
		int day = startingDayOfWeek;
		done = false;
		while(!done) {
			
			ArrayList<Integer> dayList = weekRecipes[day-1];
			
			printDayHeader(printWriter, day);
			for (Integer recipeIndex : dayList) {
				Recipe recipe = recipeList.get(recipeIndex);
				printWriter.println("   " + recipe.getName());
				shoppingList.addAll(recipe.getIngredients());
				
			}
			printWriter.println();
			
			day = (day+1)==8 ? 1 : day+1; 
			
			if (day == startingDayOfWeek) {
				done = true;
			}
	    
		}

		Collections.sort(shoppingList);
		
		printWriter.print("\r\n\r\n\r\n");
		printWriter.println("------------------------------------");
		printWriter.println("Shopping List\r\n");
		for (Ingredient ingrd : shoppingList) {
			printWriter.printf("   %-25s %-2.2f, %s\r\n", ingrd.getName(), 
														   ingrd.getAmount(), 
														   ingrd.getUnit());
		}

	    printWriter.flush();
	    printWriter.close();

		
	}
	
	private void printDayHeader(PrintWriter pw, int day) {
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		pw.println("*********************");
		pw.printf("%s meals\r\n", days[day-1]);
		pw.println("---------------------");
		
	}


	public boolean listMade() {
		return weekListMade;
	}
}