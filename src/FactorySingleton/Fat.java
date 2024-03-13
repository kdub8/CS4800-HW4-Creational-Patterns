/**
 * Represents a type of macronutrient: Fat.
 */
public class Fat extends Macronutrient {
    /**
     * Constructs a new Fat object with the specified food item.
     *
     * @param foodItem the food item representing the fat
     */
    public Fat(String foodItem) {
        super(foodItem);
    }

    /**
     * Returns a description of the fat.
     *
     * @return a description of the fat
     */
    @Override
    public String getDescription() {
        return "Fat: " + foodItem;
    }
}
