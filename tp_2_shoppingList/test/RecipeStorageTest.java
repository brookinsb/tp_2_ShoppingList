import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class RecipeStorageTest {

	@Test
	void add_one_recipe_test() {
		RecipeStorage storage = new RecipeStorage("testFile.yml");
		
		ArrayList<Recipe> recipeList = new ArrayList<>();
		ArrayList<Recipe> recipeListFromFile = new ArrayList<>();

		
		Recipe newRecipe = new Recipe("Lasagna");
		newRecipe.addIngredient(new Ingredient("Thyme", 1, "teaspoon"));
		newRecipe.addIngredient(new Ingredient("Diced Tomatoes", 1, "Can"));
		recipeList.add(newRecipe);
		
		storage.write(recipeList);
		
		recipeListFromFile = storage.read();
		
		assertEquals(1, recipeListFromFile.size());

	}

	@Test
	void add_two_recipe_test() {
		RecipeStorage storage = new RecipeStorage("testFile.yml");
		
		ArrayList<Recipe> recipeList = new ArrayList<>();
		ArrayList<Recipe> recipeListFromFile = new ArrayList<>();

		
		Recipe newRecipe = new Recipe("Lasagna");
		newRecipe.addIngredient(new Ingredient("Thyme", 1, "teaspoon"));
		newRecipe.addIngredient(new Ingredient("Diced Tomatoes", 1, "Can"));
		recipeList.add(newRecipe);
		
		newRecipe = new Recipe("Banana Bread");
		newRecipe.addIngredient(new Ingredient("Banana", 3, "Each"));
		newRecipe.addIngredient(new Ingredient("Flour", 1, "Cup"));
		newRecipe.addIngredient(new Ingredient("Sugar", 0.5, "Cup"));
		recipeList.add(newRecipe);
		
		storage.write(recipeList);
		
		recipeListFromFile = storage.read();
		
		assertEquals(2, recipeListFromFile.size());

	}

	@Test
	void add_new_file_test() {
		File file = new File("testFile.yml");
		if(file.exists()) {
			file.delete();
		}
		RecipeStorage storage = new RecipeStorage("testFile.yml");
		
		ArrayList<Recipe> recipeList = new ArrayList<>();
		ArrayList<Recipe> recipeListFromFile;
		recipeListFromFile = storage.read();
		
		assertNotNull(recipeListFromFile);

	}

}
