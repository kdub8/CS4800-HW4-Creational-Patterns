/**
 * A factory class for creating Protein macronutrients based on the customer's
 * diet plan.
 */
public class ProteinFactory extends MacronutrientFactory {
    private static ProteinFactory factory = null;

    private ProteinFactory() {
    }

    /**
     * Returns the singleton instance of the ProteinFactory.
     *
     * @return the singleton instance of the ProteinFactory
     */
    public static ProteinFactory getFactory() {
        if (factory == null) {
            factory = new ProteinFactory();
        }

        return factory;
    }

    /**
     * Creates a Protein macronutrient based on the customer's diet plan.
     *
     * @param dietPlan the customer's diet plan
     * @return a Protein macronutrient
     */
    @Override
    public Macronutrient getMacronutrient(DietPlan dietPlan) {
        if (dietPlan == DietPlan.VEGAN) {
            return new Protein("Tofu");
        } else if (dietPlan == DietPlan.PALEO) {
            return new Protein(super.getRandomFoodItem(new String[] { "Fish", "Chicken", "Beef" }));
        } else {
            return new Protein(super.getRandomFoodItem(new String[] { "Fish", "Chicken", "Beef", "Tofu" }));
        }
    }
}
