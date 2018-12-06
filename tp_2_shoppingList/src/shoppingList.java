import java.io.FileWriter;
import java.util.ArrayList;

import com.esotericsoftware.yamlbeans.*;

import edu.princeton.cs.introcs.*;


public class shoppingList {

	public static void main(String[] args)
	{
		StdOut.print("Hello");

		Recipe newRecipe = new Recipe("Lasagna");
		Ingredient ingrd = new Ingredient("Thyme", 1, "teaspoon");
		newRecipe.addIngredient(ingrd);
		newRecipe.addIngredient(new Ingredient("Diced Tomatoes", 1, "Can"));
		try {
			ArrayList<String> tmp = new ArrayList<String>();
			tmp.add("test1");
			tmp.add("test2");
			YamlWriter writer = new YamlWriter(new FileWriter("output.yml"));
			
			writer.write(newRecipe);
			writer.write(tmp);
 			writer.close();	
		}
		catch(Exception e) {
			StdOut.println("exception" + e);
		}
	}

}
