package game.monsters;

import java.awt.*;

public class RecklessCanibal extends BaseMonster{
    public RecklessCanibal( int x, int y) {
        super(4,6,8,10, Color.CYAN, x, y);
    }

    public RecklessCanibal() {
        super(4,6,8,10, Color.CYAN);
    }
}
