
public class CarbFactory extends MacronutrientFactory {
    private static CarbFactory factory = null;

    private CarbFactory() {
    }

    public static CarbFactory getFactory() {
        if (factory == null) {
            factory = new CarbFactory();
        }

        return factory;
    }

    @Override
    public Macronutrient getMacronutrient(DietPlan dietPlan) {
        if (dietPlan == DietPlan.PALEO) {
            return new Carb("Pistachio");
        } else if (dietPlan == DietPlan.VEGAN) {
            return new Carb(super.getRandomFoodItem(new String[] { "Bread", "Lentils", "Pistachio" }));
        } else if (dietPlan == DietPlan.NUT_ALLERGY) {
            return new Carb(super.getRandomFoodItem(new String[] { "Cheese", "Bread", "Lentils" }));
        } else {
            return new Carb(super.getRandomFoodItem(new String[] { "Cheese", "Bread", "Lentils", "Pistachio" }));
        }
    }
}
