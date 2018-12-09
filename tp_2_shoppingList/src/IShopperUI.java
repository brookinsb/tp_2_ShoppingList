import java.util.ArrayList;

public interface IShopperUI {

	void displayGreeting();
	
	void displayMenuOptions();
	
	int getMenuOption();
	
	void displayInvalidMenuOption();
	
	void requestRecipeName();
	
	String getRecipeName();
	
	void requestIngredientName();
	
	String getString();
	
	void requestIngredientAmount();
	
	void requestWeekStartingDay();
	
	void displayRecipeName(ArrayList<Recipe> recipeList);
	
	void requestRecipesForDay(int day);
	
	int getRecipeNumber();
}
