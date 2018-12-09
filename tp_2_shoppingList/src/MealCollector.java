import java.util.ArrayList;
import java.util.Collections;

import edu.princeton.cs.introcs.StdOut;

public class MealCollector
{
	private ArrayList<Recipe> recipeList;
	private IShopperUI ui;
	private RecipeStorage rs;
	private static String delim = "[-]+";

	
	public MealCollector(IShopperUI ui) {
		this.ui = ui;
		
		rs = new RecipeStorage("MyRecipes.yml");
		
		recipeList = rs.read();
		
	StdOut.println(recipeList.toString());
	}

	public void addRecipe() {
		boolean done = false;
		boolean validName = false;
		String recipeName = "";
		String ingredientName = "";
		String amountString = "";
		
		while (!validName) {
			ui.requestRecipeName();
			recipeName = ui.getString();
			if (!recipeName.isEmpty()) {
				validName = true;
			}
		}

		Recipe newRecipe = new Recipe(recipeName);

		while(!done) {
			ui.requestIngredientName();
			ingredientName = ui.getString();
			if (!ingredientName.isEmpty()) {
				validName = true;
				if (!ingredientName.equals("0")) {
					ui.requestIngredientAmount();
					amountString = ui.getString();
					String[] tokens = amountString.split(delim);
					
					double amount = getAmoutValue(tokens[0]);
					
					String units = tokens[1];
					newRecipe.addIngredient(new Ingredient(ingredientName,
															amount,
															units));
				}
				else {
					recipeList.add(newRecipe);
//					Collections.sort(recipeList, );
					rs.write(recipeList);
					done = true;
				}
			}
		
			
		}
	}

	private double getAmoutValue(String amountString) {
		int intValue = 0;
		double returnValue;
		if (amountString.contains(" ")) {
			intValue = Integer.parseInt(amountString.split("[ ]+")[0]);
			amountString = amountString.split("[ ]+")[1];
		}
		
		if (amountString.contains("/")) {
			String[] fractionValues = amountString.split("[/]+");
			double numerator = Double.parseDouble(fractionValues[0]);
			double denumerator = Double.parseDouble(fractionValues[1]);
			returnValue = intValue + (numerator/denumerator);
		} else {
			returnValue = Double.parseDouble(amountString);
		}
		return returnValue;
	}
}
