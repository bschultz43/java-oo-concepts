package edu.wctc.coffee;

public enum Flavor {
    CLASSIC("Classic Roast"),
    DARK("Dark Roast"),
    MOCHA("Mocha"),
    VANILLA("French Vanilla"),
    HAZELNUT("Hazelnut"),
    CARAMEL("Caramel Macchiato");

    private String flavorName;

    Flavor(String flavorName) {
        this.flavorName = flavorName;
    }

    public String getFlavorName() {
        return flavorName;
    }
}
