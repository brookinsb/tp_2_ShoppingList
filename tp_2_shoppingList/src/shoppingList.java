import java.io.FileWriter;
import java.util.ArrayList;

import com.esotericsoftware.yamlbeans.*;

import edu.princeton.cs.introcs.*;


public class shoppingList {

	public static void main(String[] args)
	{
		StdOut.print("Hello");
		ArrayList<Recipe> recipeList = new ArrayList<>();

		
		Recipe newRecipe = new Recipe("Lasagna");
		newRecipe.addIngredient(new Ingredient("Thyme", 1, "teaspoon"));
		newRecipe.addIngredient(new Ingredient("Diced Tomatoes", 1, "Can"));
		recipeList.add(newRecipe);
		
		newRecipe = new Recipe("Banana Bread");
		newRecipe.addIngredient(new Ingredient("Banana", 3, "Each"));
		newRecipe.addIngredient(new Ingredient("Flour", 1, "Cup"));
		newRecipe.addIngredient(new Ingredient("Sugar", 0.5, "Cup"));
		recipeList.add(newRecipe);
		
		
		try {
			YamlWriter writer = new YamlWriter(new FileWriter("MyRecipes.yml"));
			
			writer.write(recipeList);
 			writer.close();	
		}
		catch(Exception e) {
			StdOut.println("exception" + e);
		}
	}

}
