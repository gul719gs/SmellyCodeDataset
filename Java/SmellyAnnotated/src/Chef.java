package src;

public class Chef {

    private boolean busy = false;

    public Chef() {
    }

    public void bakePizza(String type) {
        busy = true;
        System.out.println("Chef is baking " + type + " pizza");
        busy = false;
    }

    public void hurryUp() {
        System.out.println("Chef is hurrying up!");
    }

    public void cleanKitchen() {
        System.out.println("Chef is cleaning the kitchen");
    }

    public boolean isBusy() {
        return busy;
    }
}
