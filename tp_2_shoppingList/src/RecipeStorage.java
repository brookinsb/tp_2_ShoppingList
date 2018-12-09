import java.io.*;
import java.util.ArrayList;

import com.esotericsoftware.yamlbeans.*;

import edu.princeton.cs.introcs.StdOut;

public class RecipeStorage {

	private String mFileName;
	
	public RecipeStorage(String fileName) {
		this.mFileName = fileName;
		
	}
	
	public ArrayList<Recipe> read(){
		ArrayList<Recipe> recipeList = new ArrayList<>();
		try {
			YamlReader yamlReader = new YamlReader(new FileReader(mFileName));
			
			recipeList = (ArrayList<Recipe>)yamlReader.read();
		}
		catch(IOException e) {
			StdOut.println("exception" + e);
		}
		
		return recipeList;
	}
	
	public void write(ArrayList<Recipe> recipes) {
		try {
			YamlWriter yamlWriter = new YamlWriter(new FileWriter(mFileName));

			yamlWriter.write(recipes);
			yamlWriter.close();	
			
		}
		catch(IOException e){
			
		}
		
	}
}
