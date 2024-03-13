import java.util.*;

// Toppings enum
enum Topping {
    PEPPERONI, SAUSAGE, MUSHROOMS, BACON, ONIONS, EXTRA_CHEESE, PEPPERS, CHICKEN, OLIVES,
    SPINACH, TOMATO_AND_BASIL, BEEF, HAM, PESTO, SPICY_PORK, HAM_AND_PINEAPPLE
}

// Pizza class
class Pizza {
    private final String chain;
    private final String size;
    private final List<Topping> toppings;

    protected Pizza(Builder builder) {
        this.chain = builder.chain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public void eat() {
        System.out.println("Eating " + chain + " " + size + " pizza with toppings: " + toppings);
        System.out.println();
    }

    public static class Builder {
        private final String chain;
        private final String size;
        private final List<Topping> toppings = new ArrayList<>();

        // pizza sizes are REQUIRED and must be set! This is why they are parameters for
        // the Builder
        public Builder(String chain, String size) {
            this.chain = chain;
            this.size = size;
        }

        public Builder addTopping(Topping topping) {
            toppings.add(topping);
            return this;
        }

        // since Pizza sizes and chains are required, and are needed to print out the
        // info in the eat() function
        // we check if they are null or an empty string and throw exceptions notifying
        // the user that they are required
        public Pizza build() {
            if (chain == null || chain == "") {
                throw new IllegalStateException("Pizza chain is required!");
            }
            if (size == null || size == "") {
                throw new IllegalStateException("Pizza size is required!");
            }
            return new Pizza(this);
        }
    }
}

class LittleCaesars extends Pizza {
    public LittleCaesars(Builder builder) {
        super(builder);
    }
}

class Dominos extends Pizza {
    public Dominos(Builder builder) {
        super(builder);
    }
}

// Driver program
public class Main {
    public static void main(String[] args) {

        // ANSWERS FOR QUESTION 1
        /*
         * Create a driver program to create three pizzas one of each size with 3, 6,
         * and 9 toppings to your
         * liking and eat() all of them
         */

        System.out.println("Pizzas for question 1:");
        System.out.println();

        // 3 toppings
        Pizza hutSmall = new Pizza.Builder("Pizza Hut", "Small")
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.MUSHROOMS)
                .build();
        hutSmall.eat();

        // 6 toppings
        Pizza hutMedium = new Pizza.Builder("Pizza Hut", "Medium")
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.MUSHROOMS)
                .addTopping(Topping.ONIONS)
                .addTopping(Topping.OLIVES)
                .addTopping(Topping.PEPPERS)
                .build();
        hutMedium.eat();

        // 9 toppings
        Pizza hutLarge = new Pizza.Builder("Pizza Hut", "Large")
                .addTopping(Topping.TOMATO_AND_BASIL)
                .addTopping(Topping.BEEF)
                .addTopping(Topping.ONIONS)
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.MUSHROOMS)
                .addTopping(Topping.CHICKEN)
                .addTopping(Topping.OLIVES)
                .addTopping(Topping.PEPPERS)
                .build();
        hutLarge.eat();

        // ANSWERS FOR QUESTION 2
        /*
         * Now assume you purchased another two pizza chains, Little Caesars, and
         * Dominos. You want to
         * add them to your program following the rules mentioned above.
         * Create the following pizzas and eat() all of them:
         * 
         * Pizza Hut:
         * Large pizza with 3 toppings
         * Small pizza with 2 toppings
         * 
         * Little Caesars:
         * Medium pizza with 8 toppings
         * Small pizza with 6 toppings
         * 
         * Dominos:
         * Small pizza with 1 topping
         * Large pizza with 3 toppings
         */

        System.out.println("Pizzas for question 2:");
        System.out.println();

        // Create Pizza Hut pizzas
        Pizza hutLarge2 = new Pizza.Builder("Pizza Hut", "Large")
                .addTopping(Topping.TOMATO_AND_BASIL)
                .addTopping(Topping.BEEF)
                .addTopping(Topping.ONIONS)
                .build();
        hutLarge2.eat();

        Pizza hutSmall2 = new Pizza.Builder("Pizza Hut", "Small")
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.MUSHROOMS)
                .build();
        hutSmall2.eat();

        // Create Little Caesar's pizzas
        Pizza lcMedium = new Pizza.Builder("Little Caesars", "Medium")
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.PEPPERS)
                .addTopping(Topping.ONIONS)
                .addTopping(Topping.OLIVES)
                .addTopping(Topping.MUSHROOMS)
                .addTopping(Topping.EXTRA_CHEESE)
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.BACON)
                .build();
        lcMedium.eat();

        Pizza lcSmall = new Pizza.Builder("Little Caesars", "Small")
                .addTopping(Topping.SPICY_PORK)
                .addTopping(Topping.PEPPERS)
                .addTopping(Topping.SPINACH)
                .addTopping(Topping.MUSHROOMS)
                .addTopping(Topping.HAM_AND_PINEAPPLE)
                .addTopping(Topping.BEEF)
                .build();
        lcSmall.eat();

        // Create Dominos pizzas
        Pizza dominosSmall = new Pizza.Builder("Dominos", "Small")
                .addTopping(Topping.TOMATO_AND_BASIL)
                .build();
        dominosSmall.eat();

        Pizza dominosLarge = new Pizza.Builder("Dominos", "Large")
                .addTopping(Topping.PESTO)
                .addTopping(Topping.ONIONS)
                .addTopping(Topping.HAM)
                .build();
        dominosLarge.eat();
    }
}
