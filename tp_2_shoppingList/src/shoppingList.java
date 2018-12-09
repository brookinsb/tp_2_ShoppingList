
public class shoppingList {

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
				
			case 9:
				done = true;
				break;

			default:
				ui.displayInvalidMenuOption();
				break;
			}
			
		}
		// Request 
		
//		try {
//			YamlReader reader = new YamlReader(new FileReader("MyRecipes.yml"));
//			
//			recipeList = (ArrayList<Recipe>)reader.read();
//			StdOut.println(recipeList.toString());
//			
//		}
//		catch(Exception e) {
//			StdOut.println("exception" + e);
//		}
	}

}
