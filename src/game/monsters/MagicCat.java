package game.monsters;

import java.awt.*;

public class MagicCat extends BaseMonster{
    public MagicCat() {
        super(8,5,10,1, Color.BLUE);
    }

    public MagicCat(int x, int y) {
        super(8,5,10,1, Color.BLUE, x, y);


    }
}
