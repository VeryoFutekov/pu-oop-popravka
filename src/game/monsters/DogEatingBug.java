package game.monsters;

import java.awt.*;

public class DogEatingBug extends BaseMonster {
    public DogEatingBug(int x, int y) {
        super(10, 2, 8, 5, Color.MAGENTA, x, y);
    }

    public DogEatingBug() {
        super(10, 2, 8, 5, Color.MAGENTA);
    }
}
