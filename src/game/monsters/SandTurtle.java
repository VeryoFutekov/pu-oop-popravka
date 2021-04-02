package game.monsters;

import java.awt.*;

public class SandTurtle extends BaseMonster{
    public SandTurtle( int x, int y) {
        super(5,10,1,4, Color.ORANGE, x, y);
    }

    public SandTurtle() {
        super(5,10,1,4, Color.ORANGE);
    }
}
