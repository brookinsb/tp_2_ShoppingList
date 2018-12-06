
public class Ingredient {

	String mName;
	double mAmount;
	String mUnit;
	
	public Ingredient() {
	}
	
	public Ingredient(String name, double amount, String unit) {
		mName = name;
		mAmount = amount;
		mUnit = unit;
	}
	
	public String getName() {
		return mName;
	}
	public void setName(String name) {
		this.mName = name;
	}
	public double getAmount() {
		return mAmount;
	}
	public void setAmount(double amount) {
		this.mAmount = amount;
	}
	public String getUnit() {
		return mUnit;
	}
	public void setUnit(String unit) {
		this.mUnit = unit;
	}
	
	
}
