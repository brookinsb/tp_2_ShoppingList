import java.util.ArrayList;

import edu.princeton.cs.introcs.StdOut;

public class MealCollector
{
	private ArrayList<Recipe> recipeList;
	private IShopperUI ui;
	
	public MealCollector(IShopperUI ui) {
		this.ui = ui;
		
		RecipeStorage rs = new RecipeStorage("MyRecipes.yml");
		
		recipeList = rs.read();
		
	StdOut.println(recipeList.toString());
	}

	public void addRecipe() {
		boolean done = false;
		boolean validName = false;
		String recipeName = "";
		String ingredientName = "";
		
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
					ui.requestIngredientAmount();
				}
				else {
					done = true;
				}
			}
		
			
		}
	}
}
