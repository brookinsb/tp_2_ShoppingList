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
	
	@Test
	public void ingredient_string_test() {
		Ingredient ingrd = new Ingredient("Flour", 1, "cup");
		
		ingrd.setName("Sugar");
		ingrd.setAmount(2);
		ingrd.setUnit("Tablespoon");
		
		assertEquals("Sugar, 2.0, Tablespoon", ingrd.toString());
	}

	@Test
	public void ingredient_compare_test() {
		Ingredient ingrd1 = new Ingredient("Flour", 1, "cup");
		Ingredient ingrd2 = new Ingredient("Salt", 1, "cup");
		
		assertTrue(ingrd1.compareTo(ingrd2) < 0);
	}

	@Test
	public void ingredient_noarg_test() {
		Ingredient ingrd = new Ingredient();
		
		assertNotNull(ingrd);
	}

}
