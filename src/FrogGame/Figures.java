package FrogGame;
import java.awt.*;

public class Figures {

    private int row;
    private int col;
    private Color color;
    private boolean isLeader;
    private boolean isTurtle;

    public boolean isLeader() {
        return isLeader;
    }

    public boolean isTurtle() {
        return isTurtle;
    }

    /**
     *  Конструктор за фигурите.
     */
    public Figures(int row, int col, Color color, boolean isLeader, boolean isTurtle) {
        this.row = row;
        this.col = col;
        this.color = color;
        this.isLeader = isLeader;
        this.isTurtle = isTurtle;
    }

    public Color getColor() {
        return color;
    }

    /**
     *  Метод, чрез който рисуваме фигурите на дъската.
     */
    public void render(Graphics g) {

        int x = this.col * Tiles.TILE_SIZE;
        int y = this.row * Tiles.TILE_SIZE;

        if(isLeader && !isTurtle) {
            g.setColor(this.color);
            g.fillRect(x+25,y+25,50,50);
        } else if (!isLeader && !isTurtle) {
            g.setColor(this.color);
            g.fillOval(x+35, y+35, 25, 25);
        } else {
            g.setColor(this.color);
            g.drawOval(x+25,y+25,50,50);
        }

    }

    public void move(int row, int col) {
        this.row = row;
        this.col = col;
    }

}
