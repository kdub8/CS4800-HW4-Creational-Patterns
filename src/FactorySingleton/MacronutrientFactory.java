/**
 * Abstract class representing a factory for creating macronutrients.
 */
public abstract class MacronutrientFactory {
    /**
     * Gets a macronutrient based on the specified diet plan.
     *
     * @param dietPlan The diet plan for which to create the macronutrient.
     * @return A macronutrient object.
     */
    public abstract Macronutrient getMacronutrient(DietPlan dietPlan);

    /**
     * Gets a random food item from the specified array of food items.
     *
     * @param foodItems An array of food items.
     * @return A random food item from the array.
     */
    protected final String getRandomFoodItem(String[] foodItems) {
        int randomIndex = (int) (Math.random() * foodItems.length);

        return foodItems[randomIndex];
    }
}
