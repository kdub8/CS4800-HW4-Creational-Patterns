/**
 * A factory class for creating instances of the {@link Carb} class, which
 * represents carbohydrates.
 */
public class CarbFactory extends MacronutrientFactory {
    private static CarbFactory factory = null;

    private CarbFactory() {
    }

    /**
     * Returns the singleton instance of the {@code CarbFactory}.
     *
     * @return the singleton instance of the {@code CarbFactory}
     */

    public static CarbFactory getFactory() {
        if (factory == null) {
            factory = new CarbFactory();
        }

        return factory;
    }

    /**
     * Creates and returns a new {@link Carb} instance based on the given
     * {@link DietPlan}.
     * <p>
     * If the diet plan is {@link DietPlan#PALEO}, a {@link Carb} instance with the
     * food item "Pistachio" is returned.
     * If the diet plan is {@link DietPlan#VEGAN}, a {@link Carb} instance with a
     * random food item from "Bread", "Lentils", or "Pistachio" is returned.
     * If the diet plan is {@link DietPlan#NUT_ALLERGY}, a {@link Carb} instance
     * with a random food item from "Cheese", "Bread", or "Lentils" is returned.
     * Otherwise, a {@link Carb} instance with a random food item from "Cheese",
     * "Bread", "Lentils", or "Pistachio" is returned.
     *
     * @param dietPlan the diet plan for which to create the {@link Carb} instance
     * @return a new {@link Carb} instance based on the given diet plan
     */

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
