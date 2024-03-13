/**
 * Abstract class representing a macronutrient.
 */
public abstract class Macronutrient {
    /**
     * The food item associated with the macronutrient.
     */
    protected String foodItem;

    /**
     * Constructs a new Macronutrient with the given food item.
     *
     * @param foodItem the food item associated with the macronutrient
     */
    public Macronutrient(String foodItem) {
        this.foodItem = foodItem;
    }

    /**
     * Abstract method to be implemented by subclasses to return a description of
     * the macronutrient.
     *
     * @return a description of the macronutrient
     */
    abstract public String getDescription();
}
