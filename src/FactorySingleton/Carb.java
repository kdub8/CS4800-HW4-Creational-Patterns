/**
 * Represents a carbohydrate macronutrient.
 */
public class Carb extends Macronutrient {

    /**
     * Constructs a new Carb instance with the given food item.
     *
     * @param foodItem the food item representing the carbohydrate
     */
    public Carb(String foodItem) {
        super(foodItem);
    }

    /**
     * Returns the description of the carbohydrate.
     *
     * @return the description of the carbohydrate
     */
    @Override
    public String getDescription() {
        return "Carb: " + foodItem;
    }
}
