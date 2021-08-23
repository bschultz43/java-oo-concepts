package edu.wctc.coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tray {
    private int rows, columns;
    private List<CoffeePod> pods;
    private int[] inventory;

    public Tray(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pods = new ArrayList<>();
        inventory = new int[this.columns];
        fillTray();
    }

    public void fillTray() {
        int count = 0;
        Random rng = new Random();
        int randomNumber;

        for(Flavor flavor : Flavor.values()) {
            if(count < this.columns) {
                randomNumber = rng.nextInt(CoffeeType.values().length);
                pods.add(new CoffeePod(flavor, CoffeeType.values()[randomNumber]));
                inventory[count] = this.rows;
                count++;
            }
        }
    }

    public CoffeePod getCoffeePod(Flavor flavor, CoffeeType type) {
        CoffeePod temp = new CoffeePod(flavor, type);
        CoffeePod found = null;

        for(int i = 0; i < pods.size(); i++) {
            if(pods.get(i).equals(temp)) {
                inventory[i]--;
                found = pods.get(i).copy();
            }
        }

        return found;
    }

    @Override
    public String toString() {
        String output = "";

        for(int i = 0; i < pods.size(); i++) {
            output += String.format("%s (%d)\n", pods.get(i).toString(), inventory[i]);
        }

        return output;
    }
}
