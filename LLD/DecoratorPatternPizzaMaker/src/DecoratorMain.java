import com.pizza.model.*;
import com.pizza.model.crusts.ThinCrust;
import com.pizza.model.sauces.SecretSauce;
import com.pizza.model.sizes.PizzaSize;

import java.util.ArrayList;

public class DecoratorMain {
    public static void main(String[] args) {
        Crust crust = new ThinCrust();
        PizzaTopping pizzaTopping = PizzaTopping.TOMATOES;
        ArrayList<PizzaTopping> toppings = new ArrayList<>();
        toppings.add(pizzaTopping);
        Sauce sauce = new SecretSauce();
        Pizza pizza = new Pizza( crust,toppings, sauce,  PizzaSize.LARGE);
        ArrayList<PizzaTopping> addOns = new ArrayList<>();
        addOns.add(PizzaTopping.CHEESE);
        addOns.add(PizzaTopping.TOMATOES);
        CustomPizza customPizza = new CustomPizza(pizza, PizzaSize.LARGE, addOns);
        System.out.println("Hello world!");
        System.out.println("Pizz is ready !!!"+ customPizza);
        System.out.println("Pizz is cost is "+customPizza.getCost());
    }
}