import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class RecipeTest {

	@Test
	public void create_recipe_test() {
		Recipe recipe = new Recipe("Chili");
		
		assertEquals("Chili", recipe.getName());
		assertEquals(0, recipe.getIngredients().size());
	}

	@Test
	public void create_recipe_with_one_ingredient_test() {
		Recipe recipe = new Recipe("Lasagna");
		
		recipe.addIngredient(new Ingredient("Lasagna Noodles", 1, "box"));
		
		assertEquals("Lasagna", recipe.getName());
		assertEquals(1, recipe.getIngredients().size());
		ArrayList<Ingredient> ingrdList = recipe.getIngredients();
		assertEquals("Lasagna Noodles", ingrdList.get(0).getName());
	}

	@Test
	public void create_recipe_with_two_ingredients_test() {
		Recipe recipe = new Recipe("Lasagna");
		
		recipe.addIngredient(new Ingredient("Lasagna Noodles", 1, "box"));
		recipe.addIngredient(new Ingredient("Tomato sauce", 1, "can"));
		
		assertEquals("Lasagna", recipe.getName());
		assertEquals(2, recipe.getIngredients().size());
		ArrayList<Ingredient> ingrdList = recipe.getIngredients();
		assertEquals("Lasagna Noodles", ingrdList.get(0).getName());
		assertEquals("Tomato sauce", ingrdList.get(1).getName());
	}

	@Test
	public void change_recipe_name_test() {
		Recipe recipe = new Recipe("Chili");
		
		assertEquals("Chili", recipe.getName());
		recipe.setName("Fruit Cake");
		assertEquals("Fruit Cake", recipe.getName());
	}

	@Test
	public void create_empty_recipe_test() {
		Recipe recipe = new Recipe();
		
		assertEquals("", recipe.getName());
		assertEquals(0, recipe.getIngredients().size());
	}

	@Test
	public void compare_recipe_test() {
		Recipe recipe1 = new Recipe("Taco Salad");
		Recipe recipe2 = new Recipe("Banana Bread");
		
		assertTrue(recipe1.compareTo(recipe2) > 0);
	}

	@Test
	public void recipe_string_test() {
		Recipe recipe = new Recipe("Toast");
		
		assertEquals("Toast", recipe.toString());
	}

}
