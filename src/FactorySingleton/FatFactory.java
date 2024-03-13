
public class FatFactory extends MacronutrientFactory {
    private static FatFactory factory = null;

    private FatFactory() {
    }

    public static FatFactory getFactory() {
        if (factory == null) {
            factory = new FatFactory();
        }

        return factory;
    }

    @Override
    public Macronutrient getMacronutrient(DietPlan dietPlan) {
        if (dietPlan == DietPlan.VEGAN) {
            return new Fat(super.getRandomFoodItem(new String[] { "Avocado", "Peanuts" }));
        } else if (dietPlan == DietPlan.PALEO) {
            return new Fat(super.getRandomFoodItem(new String[] { "Avocado", "Tuna", "Peanuts" }));
        } else if (dietPlan == DietPlan.NUT_ALLERGY) {
            return new Fat(super.getRandomFoodItem(new String[] { "Avocado", "Tuna", "Sour Cream" }));
        } else {
            return new Fat(super.getRandomFoodItem(new String[] { "Avocado", "Tuna", "Sour Cream", "Peanuts" }));
        }
    }
}
