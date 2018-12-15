
public class MealPlanner {
	private static String fileName = "MyRecipes.yml";

	private static final int ADD_RECIPE = 1;
	private static final int ADD_MEAL_PLAN = 2;
	
	
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
			case ADD_RECIPE:
				MealCollector mealCollector = new MealCollector(ui, fileName);
				mealCollector.addRecipe();
				break;
				
			case ADD_MEAL_PLAN:
				mealPrepper.selectRecipes();
				break;

			case CREATE_SHOPPING_LIST:
				if (mealPrepper.listMade()) {
					try {
						mealPrepper.writeShoppingList();
						
					} catch (Exception e) {
						ui.displayIOError();
					}
				} else {
					ui.displayNeedListMessage();
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
