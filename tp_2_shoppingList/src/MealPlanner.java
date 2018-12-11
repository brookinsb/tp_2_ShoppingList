
public class MealPlanner {

	public static void main(String[] args)
	{
		boolean done = false;
		IShopperUI ui = new ShopperUI();
		MealPrepper mealPrepper = new MealPrepper(ui, "MyRecipes.yml");
		
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
				mealPrepper.selectRecipes();
				break;

			case 3:
				if (mealPrepper.listMade()) {
					try {
						mealPrepper.writeShoppingList();
						
					} catch (Exception e) {
						ui.displayIOError();
					}
				} else {

				}
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
