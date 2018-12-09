
public class MealPlanner {

	public static void main(String[] args)
	{
		boolean done = false;
		IShopperUI ui = new ShopperUI();
		
		ui.displayGreeting();
		
		while (!done) {
			ui.displayMenuOptions();
			int task = ui.getMenuOption();
			
			switch (task) {
			case 1:
				MealCollector mealCollector = new MealCollector(ui);
				mealCollector.addRecipe();
				break;
				
			case 2:
				MealPrepper mealPrepper = new MealPrepper(ui);
				mealPrepper.selectRecipes();
				break;

			case 3:
				ShoppingList sl = new ShoppingList();
				break;
				
			case 9:
				done = true;
				break;

			default:
				ui.displayInvalidMenuOption();
				break;
			}
			
		}
	}

}
