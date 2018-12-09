import java.util.ArrayList;

import edu.princeton.cs.introcs.StdOut;

public class MealPrepper
{
	private ArrayList<Recipe> recipeList;
	private IShopperUI ui;
	private RecipeStorage rs;
	private ArrayList<Integer> weekRecipes[]; 

	
	public MealPrepper(IShopperUI ui) {
		this.ui = ui;
		
		rs = new RecipeStorage("MyRecipes.yml");
		
		recipeList = rs.read();
		
	StdOut.println(recipeList.toString());
	}


	public void selectRecipes() {
		boolean done = false;

		ui.requestWeekStartingDay();
		int startingDayOfWeek = getAndValidateDay();
		while (startingDayOfWeek == 0) {
			startingDayOfWeek = getAndValidateDay();
		}
		
		
		int day = startingDayOfWeek;
		while(!done) {
			ui.displayRecipeName(recipeList);
			ui.requestRecipesForDay(day);
			
			int recipeNumber = 1;
			while (recipeNumber !=0) {
				recipeNumber = ui.getRecipeNumber();
				weekRecipes[day].add(recipeNumber);
			}
			
			day = (day+1)==8 ? 1 : day+1; 
			
			if (day == startingDayOfWeek) {
				done = true;
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
}