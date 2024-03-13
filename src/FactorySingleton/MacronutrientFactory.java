
public abstract class MacronutrientFactory {
    public abstract Macronutrient getMacronutrient(DietPlan dietPlan);

    protected final String getRandomFoodItem(String[] foodItems) {
        int randomIndex = (int) (Math.random() * foodItems.length);

        return foodItems[randomIndex];
    }
}
