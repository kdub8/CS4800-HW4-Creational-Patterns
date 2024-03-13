/**
 * Represents a customer with a name and a diet plan.
 */
public class Customer {

    private final String name;
    private final DietPlan dietPlan;

    /**
     * Constructs a new customer with the specified name and diet plan.
     *
     * @param name     the name of the customer
     * @param dietPlan the diet plan of the customer
     */
    public Customer(String name, DietPlan dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    /**
     * Gets the diet plan of the customer.
     *
     * @return the diet plan of the customer
     */
    public DietPlan getDietPlan() {
        return dietPlan;
    }

    /**
     * Gets a description of the customer including their name and diet plan.
     *
     * @return a description of the customer
     */
    public String getDescription() {
        return name + " (Diet Plan: " + dietPlan + ")";
    }
}
