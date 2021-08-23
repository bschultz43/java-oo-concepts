package edu.wctc.duckDuckGoose;

import java.util.Random;

public class Game {
    private StandingStudent it;
    private SittingStudent duck;

    public Game() {
        SittingStudent red = new SittingStudent("Red", 6, Grade.FIRST);
        SittingStudent orange = new SittingStudent("Orange", 5, Grade.K5);
        SittingStudent yellow = new SittingStudent("Yellow", 6, Grade.FIRST);
        SittingStudent green = new SittingStudent("Green", 4, Grade.K4);
        SittingStudent blue = new SittingStudent("Blue", 8, Grade.SECOND);
        StandingStudent purple = new StandingStudent("Purple", 7, Grade.FIRST);

        red.setLeft(orange);
        red.setRight(blue);
        orange.setLeft(yellow);
        orange.setRight(red);
        yellow.setLeft(green);
        yellow.setRight(orange);
        green.setLeft(blue);
        green.setRight(yellow);
        blue.setLeft(red);
        blue.setRight(green);

        it = purple;
        duck = red;
    }

    public String playGame() {
        String output = "";
        Random rn = new Random();
        int ducks = rn.nextInt(5); //zero to four
        SittingStudent goose = duck;

        for(int i = 0; i < ducks; i++) {
            goose = goose.getLeft();
            output += "Duck...\n";
        }

        output += "GOOSE!\n";
        output += String.format("%s chases %s\n", goose.toString(), it.toString());

        if(goose.isGooseAndBecomesIt()) {
            output += String.format("%s couldn't catch %s!\n", goose.getName(), it.getName());
            it = goose.swap(it);

            //Augment the previous left and right students to point to the student who was it and is now sitting
            SittingStudent left = goose.getLeft();
            SittingStudent right = goose.getRight();
            left.setRight(goose);
            right.setLeft(goose);
        }
        else {
            output += String.format("%s tags %s and returns to their seat!\n", goose.getName(), it.getName());
        }

        duck = goose;

        output += String.format("%s is it!", it.getName());

        return output;
    }
}
