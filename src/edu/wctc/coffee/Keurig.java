package edu.wctc.coffee;

public class Keurig {
    private Tray coffeeTray;
    private CoffeePod pod;

    public Keurig() {
        coffeeTray = new Tray(6, 6);
    }

    public String brew(Flavor flavor, CoffeeType type) {
        pod = coffeeTray.getCoffeePod(flavor, type);

        if(pod != null)
            return String.format("Now brewing a hot mug of %s.", pod.toString());
        else
            return "Invalid selection, try again.";
    }

    public String showInventory() {
        return coffeeTray.toString();
    }
}
