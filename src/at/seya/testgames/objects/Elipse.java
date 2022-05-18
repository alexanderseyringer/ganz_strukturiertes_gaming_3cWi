package at.seya.testgames.objects;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Elipse implements Actor {

    private float x,y;
    private float speed;
    private int diameterx;
    private int diametery;

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameterx, this.diametery);
    }

    public Elipse() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameterx = random.nextInt(20) + 20;
        this.diametery = random.nextInt(20) + 20;
    }


    public void update(int delta) {
        this.y += (float) delta / this.speed;
        if(this.y>600) {
            this.y = 0;
        }

        this.x += (float) delta / this.speed;
        if(this.x>800) {
            this.x = 0;
        }
    }
}
