package at.seya.games.objects;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Rectangle {
    private float x,y;
    private float speed;
    private int size;

    public void render(Graphics graphics) {graphics.drawRect(this.x, this.y, this.size, this.size);}

    public Rectangle() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(60) + 10;
        this.size = random.nextInt(10) + 10;

    }

    public void update(int delta){
        this.x += (float) delta / this.speed;
        if(this.x>800) {
            this.x = 0;
        }
    }

}
