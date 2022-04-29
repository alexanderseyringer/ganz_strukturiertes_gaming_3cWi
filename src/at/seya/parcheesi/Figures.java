package at.seya.parcheesi;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Color;

public class Figures implements Actor{
    private float x,y;
    private float outerDiameter, innerDiameter;



    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x, this.y, this.outerDiameter, this.outerDiameter);
        graphics.setColor(Color.red);
    }

    public Figures() {
        this.x = 0;
        this.y = 0;
        this.outerDiameter = 44;
        this.innerDiameter = 33;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }
}
