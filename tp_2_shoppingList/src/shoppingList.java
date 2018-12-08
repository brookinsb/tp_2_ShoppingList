import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.esotericsoftware.yamlbeans.*;

import edu.princeton.cs.introcs.*;


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
				MealCollector mealCollector = new MealCollector();
				
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
