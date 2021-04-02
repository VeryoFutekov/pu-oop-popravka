package game;

import game.field.Field;
import game.monsters.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Board extends JFrame implements MouseListener {

    private Field[][] fields = new Field[12][12];
    private BaseMonster  bufferFigure=null;
    private int bufferedX=0;
    private int buffereDY=0;


    public Board() throws HeadlessException {
        super.addMouseListener(this);
    }

    public void start() {
        fieldGeneration();
        initWindow();
    }

    private void initWindow() {
        super.setSize(1200, 1200);
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void fieldGeneration() {
        generateBackground();
        generateSpecificPlayerFigures(1);
        generateSpecificPlayerFigures(11);

    }

    private void generateSpecificPlayerFigures(int row) {

        List<BaseMonster> monsterList = Arrays.asList(new DogEatingBug(), new DrunkenKnight(),
                new MagicCat(), new RecklessCanibal(), new SandTurtle(), new SofisticatedSam());

        int counter=0;
        for (BaseMonster baseMonster : monsterList) {
            baseMonster.setY(row);
            baseMonster.setX(counter);
            fields[row][counter].setBaseMonster(baseMonster);

            counter+=2;

        }

    }

    private void generateBackground() {
        Color currentC = Color.BLACK;
        for (int row = 0; row < 12; row++) {

            for (int col = 0; col < 12; col++) {
                Field field = new Field(row, col, currentC);
                fields[row][col] = field;
                currentC = currentC == Color.BLACK ? Color.WHITE : Color.BLACK;
            }
            currentC = Color.WHITE == currentC ? Color.BLACK : Color.WHITE;
        }
    }

    @Override
    public void paint(Graphics g) {
        for (Field[] field : fields) {
            for (Field field1 : field) {
                field1.render(g);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int row = e.getY() / Field.FIELD_SIZE;
        int col = e.getX() / Field.FIELD_SIZE;

      if(fields[row][col].getBaseMonster()==null && bufferFigure==null){
          JOptionPane.showMessageDialog(this,"There is no figure here");
          return;
      }

      if(bufferFigure==null){
          this.bufferFigure=fields[row][col].getBaseMonster();
          this.bufferedX=col;
          this.buffereDY=row;

      }else{
          this.fields[row][col].setBaseMonster(bufferFigure);
          this.fields[buffereDY][bufferedX].setBaseMonster(null);
          bufferFigure.setX(col);
          bufferFigure.setY(row);
          bufferFigure=null;
          bufferedX=0;
          buffereDY=0;
          super.repaint();

      }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
