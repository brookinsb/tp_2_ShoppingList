import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MealPrepperTest {
	private MealPrepper mp;
	private TestUI ui;
	private int testNumber;
	private int testGetStringIndex;
	private int testRecipeNumberIndex;
	
	@Before
	public void setUp() throws Exception {
		ui = new TestUI();
		
		mp = new MealPrepper(ui, "MealPrepperTestFile.yml");
	}

	@Test
	public void testSelectRecipes() {
		testNumber = 1;
		testGetStringIndex = 1;
		mp.selectRecipes();
		
		assertTrue(mp.listMade());
	}

	@Test
	public void testSelectRecipesInvalidDayInput() {
		testNumber = 2;
		testGetStringIndex = 1;
		mp.selectRecipes();
	}

	@Test
	public void testSelectRecipesNoListMade() {
		testNumber = 3;
		testGetStringIndex = 1;
		
		assertFalse(mp.listMade());
	}

	
	@Test
	public void testWriteShoppingList() throws IOException {
		testNumber = 4;
		testGetStringIndex = 1;
		
		mp.selectRecipes();
		mp.writeShoppingList();
	}

	@Test
	public void testListMade() {
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
			// TODO Auto-generated method stub
			return null;
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

		@Override
		public void displayListCreatedMessage() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displayNeedListMessage() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
