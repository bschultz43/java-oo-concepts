package edu.wctc;

import edu.wctc.coffee.CoffeeType;
import edu.wctc.coffee.Flavor;
import edu.wctc.coffee.Keurig;
import edu.wctc.duckDuckGoose.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Keurig myCoffeeMachine = new Keurig();
//        System.out.println(myCoffeeMachine.showInventory());
//        System.out.println(myCoffeeMachine.brew(Flavor.MOCHA, CoffeeType.REGULAR));
//        System.out.println(myCoffeeMachine.showInventory());

        Scanner keyboard = new Scanner(System.in);
        Game ddg = new Game();
        boolean done = false;

        do {
            System.out.println(ddg.playGame());

            System.out.print("Keep playing? y/n>");
            String input = keyboard.nextLine();

            if(input.trim().equalsIgnoreCase("n"))
                done = true;
        } while(!done);
    }
}
