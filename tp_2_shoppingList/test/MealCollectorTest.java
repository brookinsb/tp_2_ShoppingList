import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MealCollectorTest {
	private int testNumber;
	private int testGetStringIndex;
	private int testRecipeNumberIndex;
	private TestUI ui;
	
	@Before
	public void setUp() throws Exception {
		ui = new TestUI();
	}

	@Test
	public void testMealCollector() {
		MealCollector mc = new MealCollector(ui, "TestRecipes.yaml");
		assertNotNull(mc);
	}

	@Test
	public void testAddRecipe() {
		testNumber = 1;
		testGetStringIndex = 1;
		MealCollector mc = new MealCollector(ui, "TestRecipes.yaml");
		mc.addRecipe();
		
		File file = new File("TestRecipes.yaml");
		assertTrue(file.exists());
	}
	
	@Test
	public void test_getAmountValue() {
		MealCollector mc = new MealCollector(ui, "TestRecipes.yaml");

		assertEquals(0.5, mc.getAmoutValue("0.5"), 0.01);
		assertEquals(1.0, mc.getAmoutValue("1"), 0.01);
		assertEquals(2.5, mc.getAmoutValue("2 1/2"), 0.01);
	}

	class TestUI implements IShopperUI {

		@Override
		public void displayGreeting() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displayMenuOptions() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getMenuOption() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void displayInvalidMenuOption() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void requestRecipeName() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getRecipeName() {
			String returnValue = "";
			
			switch (testNumber) {
			case 1:
				switch (testGetStringIndex) {
				case 1:
					returnValue = "";					
					break;

				case 2:
					returnValue = "Lasagna";					
					break;

				case 3:
					returnValue = "2";					
					break;

				case 4:
					returnValue = "1";					
					break;

				default:
					returnValue = "0";
					break;
				}
				break;
				
			case 2:
				switch (testGetStringIndex) {
				case 1:
					returnValue = "a";
					break;
	
				case 2:
					returnValue = "2";					
					break;
	
				default:
					returnValue = "0";
					break;
				}
				break;
	
			
			default:
				break;
			}
			testGetStringIndex++;
			return returnValue;
		}

		@Override
		public void requestIngredientName() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getString() {
			String returnValue = "";
			
			switch (testNumber) {
			case 1:
				switch (testGetStringIndex) {
				case 1:
					returnValue = "";
					break;

				case 2:
					returnValue = "Lasagna";					
					break;

				case 3:
					returnValue = "Noodles";					
					break;

				case 4:
					returnValue = "1-Box";					
					break;
					
				case 5:
					returnValue = "Tomato Sauce";					
					break;
					
				case 6:
					returnValue = "1-can";
					break;

				default:
					returnValue = "0";
					break;
				}
				break;
				
			case 2:
				switch (testGetStringIndex) {
				case 1:
					returnValue = "a";
					break;
	
				case 2:
					returnValue = "2";					
					break;
	
				default:
					returnValue = "0";
					break;
				}
				break;
	
			case 4:
				switch (testGetStringIndex) {
				case 1:
					returnValue = "0";					
					break;

				case 2:
					returnValue = "2";					
					break;

				case 3:
					returnValue = "2";					
					break;

				case 4:
					returnValue = "1";					
					break;

				default:
					returnValue = "0";
					break;
				}
				break;
				
			default:
				break;
			}
			testGetStringIndex++;
			return returnValue;
		}

		@Override
		public void requestIngredientAmount() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void requestWeekStartingDay() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displayRecipeName(ArrayList<Recipe> recipeList) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void requestRecipesForDay(int day) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getRecipeNumber() {
			int returnValue = 0;
			
			switch (testNumber) {
			case 1:
				switch (testRecipeNumberIndex) {
				case 1:
					returnValue = 0;					
					break;

				case 2:
					returnValue = 2;					
					break;

				case 3:
					returnValue = 2;					
					break;

				case 4:
					returnValue = 1;					
					break;

				default:
					returnValue = 0;
					break;
				}
				break;
				
			case 4:
				switch (testRecipeNumberIndex) {
				case 1:
					returnValue = 0;					
					break;

				case 2:
					returnValue = 2;					
					break;

				case 3:
					returnValue = 2;					
					break;

				case 4:
					returnValue = 1;					
					break;

				default:
					returnValue = 0;
					break;
				}
				break;

			default:
				break;
			}
			
			testRecipeNumberIndex++;
			
			return returnValue;
		}

		@Override
		public void displayIOError() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
