
public class MealPlanner {
	private static String fileName = "MyRecipes.yml";

	public static void main(String[] args)
	{
		boolean done = false;
		IShopperUI ui = new ShopperUI();
		MealPrepper mealPrepper = new MealPrepper(ui, fileName);
		
		ui.displayGreeting();
		
		while (!done) {
			ui.displayMenuOptions();
			int task = ui.getMenuOption();
			
			switch (task) 
			{
			case 1:
				MealCollector mealCollector = new MealCollector(ui, fileName);
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
