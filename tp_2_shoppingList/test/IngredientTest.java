import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class IngredientTest {

	@Test
	public void create_ingredient_test() {
		Ingredient ingrd = new Ingredient("Flour", 1, "cup");
		
		assertEquals("Flour", ingrd.getName());
		assertEquals(1, ingrd.getAmount());
		assertEquals("cup", ingrd.getUnit());
	}

	@Test
	public void change_ingredient_test() {
		Ingredient ingrd = new Ingredient("Flour", 1, "cup");
		
		assertEquals("Flour", ingrd.getName());
		assertEquals(1, ingrd.getAmount());
		assertEquals("cup", ingrd.getUnit());
		
		ingrd.setName("Sugar");
		ingrd.setAmount(2);
		ingrd.setUnit("Tablespoon");
		
		assertEquals("Sugar", ingrd.getName());
		assertEquals(2, ingrd.getAmount());
		assertEquals("Tablespoon", ingrd.getUnit());
	}

}
