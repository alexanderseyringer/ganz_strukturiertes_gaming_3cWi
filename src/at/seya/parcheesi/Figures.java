package at.seya.parcheesi;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Color;

import java.util.Optional;

public class Figures implements Actor{
    private float x,y;
    private float outerDiameter, innerDiameter;
    public enum COLOR {red, yellow, green, black};
    private COLOR color;
    private int figureID;

    public Figures(COLOR color, int figureID) {
        this.color = color;
        this.figureID = figureID;
        this.x = 79;
        this.y = 79;
        this.outerDiameter = 44;
        this.innerDiameter = 37.5f;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillOval(this.x, this.y, this.outerDiameter, this.outerDiameter);

        if(this.color == COLOR.red) {
            graphics.setColor(Color.red);
        }
        else if (this.color == COLOR.black) {
            graphics.setColor(Color.black);
        }
        else if (this.color == COLOR.green)  {
            graphics.setColor(Color.green);
        }
        else {
            graphics.setColor(Color.yellow);
        }
        
        graphics.fillOval(this.x+(this.outerDiameter-this.innerDiameter)/2, this.y+(this.outerDiameter-this.innerDiameter)/2, this.innerDiameter, this.innerDiameter);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }
}
