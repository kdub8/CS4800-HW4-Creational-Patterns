
import java.util.ArrayList;

/**
 * Main class that demonstrates creating and displaying customer meals.
 */

public class Main {
    /**
     * Main method that creates and displays meals for different customers.
     */
    public static void main(String[] args) {
        makeAndDisplayCustomerMeal(new Customer("Deby Lee", DietPlan.NONE));
        makeAndDisplayCustomerMeal(new Customer("Jalen Tom", DietPlan.PALEO));
        makeAndDisplayCustomerMeal(new Customer("Kevin Wong", DietPlan.NUT_ALLERGY));
        makeAndDisplayCustomerMeal(new Customer("Danzel Yap", DietPlan.VEGAN));
        makeAndDisplayCustomerMeal(new Customer("Joshua Casuga", DietPlan.NONE));
        makeAndDisplayCustomerMeal(new Customer("Koki Yamaguchi", DietPlan.NUT_ALLERGY));
    }

    /**
     * Creates and displays a meal for a given customer.
     * 
     * @param customer The customer for whom the meal is created.
     */
    public static void makeAndDisplayCustomerMeal(Customer customer) {
        MacronutrientFactory[] macronutrientFactories = { CarbFactory.getFactory(), ProteinFactory.getFactory(),
                FatFactory.getFactory() };
        Macronutrient[] meal = createMeal(customer, macronutrientFactories);
        System.out.println(customer.getDescription());
        displayMeal(meal);
        System.out.println();

    }

    /**
     * Creates a meal for a given customer using the specified macronutrient
     * factories.
     * 
     * @param customer               The customer for whom the meal is created.
     * @param macronutrientFactories The array of macronutrient factories to use.
     * @return An array of macronutrients representing the meal.
     */
    public static Macronutrient[] createMeal(Customer customer, MacronutrientFactory[] macronutrientFactories) {
        ArrayList<Macronutrient> macronutrients = new ArrayList<>();
        for (MacronutrientFactory macronutrientFactory : macronutrientFactories) {
            Macronutrient macronutrient = macronutrientFactory.getMacronutrient(customer.getDietPlan());
            macronutrients.add(macronutrient);
        }

        return macronutrients.toArray(new Macronutrient[macronutrients.size()]);
    }

    /**
     * Displays the meal plan, listing each macronutrient in the meal.
     * 
     * @param macronutrients An array of macronutrients representing the meal.
     */
    public static void displayMeal(Macronutrient[] macronutrients) {
        System.out.println("Meal Plan");
        System.out.println("|--|--|--|--|");
        for (Macronutrient macronutrient : macronutrients) {
            System.out.println(macronutrient.getDescription());
        }
    }
}