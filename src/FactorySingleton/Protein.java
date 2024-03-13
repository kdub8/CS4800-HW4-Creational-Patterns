/**
 * Represents a protein macronutrient.
 */
public class Protein extends Macronutrient {
    /**
     * Creates a new Protein instance with the given food item.
     *
     * @param foodItem the food item representing the protein
     */
    public Protein(String foodItem) {
        super(foodItem);
    }

    /**
     * Returns the description of the protein macronutrient.
     *
     * @return the description of the protein
     */
    @Override
    public String getDescription() {
        return "Protein: " + foodItem;
    }
}
