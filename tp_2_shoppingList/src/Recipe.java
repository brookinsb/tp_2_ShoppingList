import java.util.ArrayList;

public class Recipe {

	public String mName;
	public ArrayList<Ingredient> mIngredients;
	
	public Recipe() {
		this("");
	}

	public Recipe(String name) {
		mName = name;
		mIngredients = new ArrayList<>();
	}

	public String getName() {
		return mName;
	}

	public void setName(String mName) {
		this.mName = mName;
	}

	public ArrayList<Ingredient> getIngredients() {
		return mIngredients;
	}

	public void addIngredient(Ingredient ingredient) {
		mIngredients.add(ingredient);
	}
	
	@Override
	public String toString() {
		return "recipe_name: " + mName;
		
		
	}

}
