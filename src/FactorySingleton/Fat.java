
public class Fat extends Macronutrient {

    public Fat(String foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return "Fat: " + foodItem;
    }
}
