package Chapter4.pizzaTwo.pizza;

import Chapter4.pizzaTwo.factory.PizzaIngredientFactory;

public class NYCheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public NYCheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){
        System.out.println("준비 중 : " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

}
