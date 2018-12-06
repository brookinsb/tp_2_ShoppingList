import java.util.ArrayList;

public class Recipe {

	public ArrayList<Ingredient> mIngredients = new ArrayList<>();
	public String mName;
	
	public Recipe() {
	}

	public Recipe(String name) {
		mName = name;
	}

	public String getmName() {
		return mName;
	}

	public void setName(String mName) {
		this.mName = mName;
	}

	public ArrayList<Ingredient> getIngredients() {
		return mIngredients;
	}

	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.mIngredients = ingredients;
	}
	
	public void addIngredient(Ingredient ingredient) {
		mIngredients.add(ingredient);
	}
	
	@Override
	public String toString() {
		return "recipe_name: " + mName;
		
		
	}

}
