package Day1;

public class Day1 {
	
	public static void main(String [] args) {
		double meal_cost_bt = 12.00;
		int tip_percent = 20;
		int tax_percent = 8;
		
		double tip_cost = (meal_cost_bt * tip_percent * 0.01);
		double tax_value = (meal_cost_bt*tax_percent*0.01);
		
		int total_meal_cost = (int)(meal_cost_bt+tip_cost+tax_value);
		System.out.println("Meal’s total cost : "+total_meal_cost);
		
	}

}
