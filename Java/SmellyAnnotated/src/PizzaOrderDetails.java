package src;

public class PizzaOrderDetails {

    private String pizzaType;
    private String size;
    private String crustType;
    private String toppings;
    private boolean extraCheese;
    private String discountCode;

    public PizzaOrderDetails(String pizzaType, String size, String crustType,
                             String toppings, boolean extraCheese, String discountCode) {
        this.pizzaType = pizzaType;
        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
        this.extraCheese = extraCheese;
        this.discountCode = discountCode;
    }

    public String getPizzaType() { return pizzaType; }
    public String getSize() { return size; }
    public String getCrustType() { return crustType; }
    public String getToppings() { return toppings; }
    public boolean hasExtraCheese() { return extraCheese; }
    public String getDiscountCode() { return discountCode; }
}
