package game.monsters;

import game.field.Field;

import java.awt.*;

public abstract class BaseMonster {
    private int ap;
    private int dp;
    private int mp;
    private int s;
    private Color color;
    private int x;
    private int y;

    public BaseMonster(int ap, int dp, int mp, int s, Color color, int x, int y) {
        this.ap = ap;
        this.dp = dp;
        this.mp = mp;
        this.s = s;
        this.color = color;
        setX(x);
        setY(y);
    }

    public BaseMonster(int ap, int dp, int mp, int s, Color color) {
        this.ap = ap;
        this.dp = dp;
        this.mp = mp;
        this.s = s;
        this.color = color;
    }

    public void render(Graphics g, int x, int y) {
        g.setColor(color);
        g.drawOval(x, y,25,25);
    }

    public void setX(int x) {
        this.x = x * Field.FIELD_SIZE + 25;
    }

    public void setY(int y) {
        this.y = y * Field.FIELD_SIZE + 25;
    }

    public int getAp() {
        return ap;
    }

    public int getDp() {
        return dp;
    }

    public int getMp() {
        return mp;
    }

    public int getS() {
        return s;
    }

    public Color getColor() {
        return color;
    }
}
