package edu.wctc.coffee;

public class CoffeePod {
    private Flavor flavor;
    private CoffeeType type;

    public CoffeePod(Flavor flavor, CoffeeType type) {
        this.flavor = flavor;
        this.type = type;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public CoffeeType getType() {
        return type;
    }

    public void setType(CoffeeType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " " + flavor.getFlavorName();
    }

    public boolean equals(CoffeePod obj) {
        return this.flavor == obj.flavor && this.type == obj.type;
    }

    public CoffeePod copy() {
        return new CoffeePod(this.flavor, this.type);
    }
}
