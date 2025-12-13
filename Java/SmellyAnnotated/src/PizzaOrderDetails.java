package src;

public class PizzaOrderDetails {
    public String pizzaType;
    public String size;
    public String crustType;
    public String toppings;
    public boolean extraCheese;
    public String discountCode;

    public PizzaOrderDetails(String pizzaType, String size, String crustType,
                             String toppings, boolean extraCheese, String discountCode) {
        this.pizzaType = pizzaType;
        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
        this.extraCheese = extraCheese;
        this.discountCode = discountCode;
    }
}
