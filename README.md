# Creational Design Patterns: Pizza and Macronutrients!
## Builder Pattern: Pizza Creation
### Description
You will create a pizza chain, Pizza Hut, where pizzas can be created with various toppings. To simplify the creation process, the builder design pattern will be used to allow users to clearly understand the selected toppings.

- Toppings
- Pepperoni
- Sausage
- Mushrooms
- Bacon
- Onions
- Extra Cheese
- Peppers
- Chicken
- Olives
- Spinach
- Tomato and Basil
- Beef
- Ham
- Pesto
- Spicy Pork
- Ham and Pineapple

Pizza Sizes:
- Small
- Medium
- Large

Requirements:
The size of the pizza is required and must be set.
The eat() method should print out the pizza chain, size, and all toppings specific to that pizza.
Tasks
Create three pizzas (small, medium, large) with 3, 6, and 9 toppings respectively and eat all of them.
Add two more pizza chains, Little Caesars and Dominos, following the same rules as Pizza Hut, and create specific pizzas for each chain.

## Abstract Factory, Factory, and Singleton Patterns: Macronutrient Meals
### Description
Create a macronutrient-balanced meal for customers based on their given diet plans. The system should generate a meal with one of the following at random: Carbs, Protein, and Fats, as long as it does not violate the customer's diet plan.

Macronutrient Food Options
- Carbs: Cheese, Bread, Lentils, Pistachio
- Protein: Fish, Chicken, Beef, Tofu
- Fats: Avocado, Sour cream, Tuna, Peanuts

Diet Plans:
- No Restriction
- Paleo
- Vegan
- Nut Allergy

Requirements:
The customer provides their name and diet plan.
Each meal should have one item from each category (Carbs, Protein, Fats).
Use Abstract Factory to create the three factories (Carbs, Protein, Fats) to produce a meal for the customer at random based on their food restrictions.
Use Singleton pattern to ensure there is only one factory of each type allocated at any given time.
Tasks
Create 6 customers, each with a different diet plan, and generate a meal for each customer that meets their dietary restrictions.
