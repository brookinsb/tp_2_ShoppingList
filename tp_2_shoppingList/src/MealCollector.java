import java.util.ArrayList;
import java.util.Collections;

import edu.princeton.cs.introcs.StdOut;

public class MealCollector
{
	private ArrayList<Recipe> recipeList;
	private IShopperUI ui;
	private RecipeStorage rs;
	
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
			recipeName = ui.getRecipeName();
			if (!recipeName.isEmpty()) {
				validName = true;
			}
		}

		Recipe newRecipe = new Recipe(recipeName);

		while(!done) {
			ui.requestIngredientName();;
			ingredientName = ui.getString();
			if (!ingredientName.isEmpty()) {
				validName = true;
				if (!ingredientName.equals("0")) {
					String delim = "[/]+";
					ui.requestIngredientAmount();
					amountString = ui.getString();
					String[] tokens = amountString.split(delim);
					double amount = Double.parseDouble(tokens[0]);
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
}
