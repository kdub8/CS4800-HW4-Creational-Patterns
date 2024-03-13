
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        makeAndDisplayCustomerMeal(new Customer("Deby Lee", DietPlan.NONE));
        makeAndDisplayCustomerMeal(new Customer("Jalen Tom", DietPlan.PALEO));
        makeAndDisplayCustomerMeal(new Customer("Kevin Wong", DietPlan.NUT_ALLERGY));
        makeAndDisplayCustomerMeal(new Customer("Danzel Yap", DietPlan.VEGAN));
        makeAndDisplayCustomerMeal(new Customer("Joshua Casuga", DietPlan.NONE));
        makeAndDisplayCustomerMeal(new Customer("Koki Yamaguchi", DietPlan.NUT_ALLERGY));
    }

    public static void makeAndDisplayCustomerMeal(Customer customer) {
        MacronutrientFactory[] macronutrientFactories = { CarbFactory.getFactory(), ProteinFactory.getFactory(),
                FatFactory.getFactory() };
        Macronutrient[] meal = createMeal(customer, macronutrientFactories);
        System.out.println(customer.getDescription());
        displayMeal(meal);
        System.out.println();

    }

    public static Macronutrient[] createMeal(Customer customer, MacronutrientFactory[] macronutrientFactories) {
        ArrayList<Macronutrient> macronutrients = new ArrayList<>();
        for (MacronutrientFactory macronutrientFactory : macronutrientFactories) {
            Macronutrient macronutrient = macronutrientFactory.getMacronutrient(customer.getDietPlan());
            macronutrients.add(macronutrient);
        }

        return macronutrients.toArray(new Macronutrient[macronutrients.size()]);
    }

    public static void displayMeal(Macronutrient[] macronutrients) {
        System.out.println("Meal Plan");
        System.out.println("|--|--|--|--|");
        for (Macronutrient macronutrient : macronutrients) {
            System.out.println(macronutrient.getDescription());
        }
    }
}