import java.util.ArrayList;

import edu.princeton.cs.introcs.StdOut;

public class MealPrepper
{
	private ArrayList<Recipe> recipeList;
	private IShopperUI ui;
	private RecipeStorage rs;

	
	public MealPrepper(IShopperUI ui) {
		this.ui = ui;
		
		rs = new RecipeStorage("MyRecipes.yml");
		
		recipeList = rs.read();
		
	StdOut.println(recipeList.toString());
	}


	public void selectRecipes() {
		
	}

}
