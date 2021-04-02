package game.field;

import game.monsters.BaseMonster;

import java.awt.*;

public class Field {
    private int y;
    private int x;
    private Color color;
    public static final int FIELD_SIZE = 50;
    private BaseMonster baseMonster;

    public Field(int y, int x, Color color) {
        setX(x);
        setY(y);
        this.color = color;
    }

    public void render(Graphics g) {
        fill(g);
        draw(g);
        if (baseMonster != null) {
            baseMonster.render(g, x + 12, y +12);
        }


    }

    private void fill(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, FIELD_SIZE, FIELD_SIZE);
    }

    private void draw(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(x, y, FIELD_SIZE, FIELD_SIZE);
    }

    public BaseMonster getBaseMonster() {
        return baseMonster;
    }

    public void setBaseMonster(BaseMonster baseMonster) {
        this.baseMonster = baseMonster;
    }

    public void setY(int y) {
        this.y = y * FIELD_SIZE;
    }

    public void setX(int x) {
        this.x = x * FIELD_SIZE;
    }
}
