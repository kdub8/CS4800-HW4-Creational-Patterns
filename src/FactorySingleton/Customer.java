
public class Customer {

    private final String name;
    private final DietPlan dietPlan;

    public Customer(String name, DietPlan dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }

    public String getDescription() {
        return name + " (Diet Plan: " + dietPlan + ")";
    }
}
