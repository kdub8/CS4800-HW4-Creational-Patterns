
public class ProteinFactory extends MacronutrientFactory {
    private static ProteinFactory factory = null;

    private ProteinFactory() {
    }

    public static ProteinFactory getFactory() {
        if (factory == null) {
            factory = new ProteinFactory();
        }

        return factory;
    }

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
