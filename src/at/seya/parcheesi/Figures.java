package at.seya.parcheesi;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Color;

import java.util.Optional;

public class Figures implements Actor{
    private float outerDiameter, innerDiameter;
    public enum COLOR {red, yellow, green, gray};
    private COLOR color;
    private int figureID;

    public Figures(COLOR color, int figureID) {
        this.color = color;
        this.figureID = figureID;
        this.outerDiameter = 44;
        this.innerDiameter = 37.5f;
    }

    @Override
    public void render(Graphics graphics) {
        FigurePosition fp = new FigurePosition();
        PositionPoint point = fp.getPositionPoint(this.figureID);

        graphics.setColor(Color.black);
        graphics.fillOval(point.getX(), point.getY(), this.outerDiameter, this.outerDiameter);

        graphics.setColor(FigureColor.getFigureColor(color));
        graphics.fillOval(point.getX()+(this.outerDiameter-this.innerDiameter)/2, point.getY()+(this.outerDiameter-this.innerDiameter)/2, this.innerDiameter, this.innerDiameter);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }
}
