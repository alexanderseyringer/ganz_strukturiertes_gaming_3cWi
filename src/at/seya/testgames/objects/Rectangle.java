package at.seya.testgames.objects;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Rectangle implements Actor{
    private float x,y;
    private float speedPositive;
    private int size;
    private boolean toTheRight = true;


    public void render(Graphics graphics) {graphics.drawRect(this.x, this.y, this.size, this.size);}

    public Rectangle() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speedPositive = random.nextInt(60) + 10;
        this.size = random.nextInt(10) + 10;
        this.toTheRight = random.nextBoolean();
    }

    public void update(int delta){
        if(toTheRight == true) {
            this.x += (float) delta / this.speedPositive;
            if(this.x>800) {
                this.x = 0;
            }
        }

        else {
            this.x -= (float) delta / this.speedPositive;
            if(this.x<0) {
                this.x = 800;
            }
        }

    }

}
