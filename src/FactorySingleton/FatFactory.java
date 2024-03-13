/**
 * A factory class for creating Fat objects.
 */
public class FatFactory extends MacronutrientFactory {
    private static FatFactory factory = null;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private FatFactory() {
    }

    /**
     * Returns the singleton instance of the FatFactory.
     *
     * @return the FatFactory instance
     */
    public static FatFactory getFactory() {
        if (factory == null) {
            factory = new FatFactory();
        }

        return factory;
    }

    /**
     * Creates and returns a Fat object based on the given diet plan.
     *
     * @param dietPlan the diet plan for which to create the Fat object
     * @return a Fat object based on the given diet plan
     */
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
