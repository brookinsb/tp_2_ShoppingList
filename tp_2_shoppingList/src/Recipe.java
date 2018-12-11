import java.util.ArrayList;
import java.util.Comparator;

public class Recipe implements Comparable<Recipe> {

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
		return mName;
		
		
	}

	@Override
	public int compareTo(Recipe o) {
		return getName().compareTo(o.getName());
	}

}
