
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
}
