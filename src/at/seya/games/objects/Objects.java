package at.seya.games.objects;

import org.newdawn.slick.*;

import java.util.LinkedList;
import java.util.List;


public class Objects extends BasicGame {

    private List<Actor> actors;
    public Objects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException { // First things
        this.actors = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            Circle circle = new Circle();
            this.actors.add(circle);
        }

        for (int i = 0; i < 50; i++) {
            Rectangle rectangle = new Rectangle();
            this.actors.add(rectangle);
        }

        for (int i = 0; i < 50; i++) {
            Elipse elipse = new Elipse();
            this.actors.add(elipse);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException { // Bewegungen
        /*if(this.rectangleDirection == 1) {
            if(this.xRectangle > 600) {
                this.rectangleDirection = 2;
            }
            else {
                this.xRectangle++;
            }
        }
        else if(this.rectangleDirection == 2) {
            if(this.yRectangle > 400) {
                this.rectangleDirection = 3;
            }
            else {
                this.yRectangle++;
            }
        }
        else if(this.rectangleDirection == 3) {
            if(this.xRectangle < 100) {
                this.rectangleDirection = 4;
            }
            else {
                this.xRectangle--;
            }
        }
        else if(this.rectangleDirection == 4) {
            if(this.yRectangle < 100) {
                this.rectangleDirection = 1;
            }
            else {
                this.yRectangle--;
            }
        }
        if(this.xOvalDirection == 1) {
            if(this.xOval > 700) {
                this.xOvalDirection = 2;
            }
            else {
                this.xOval++;
            }
        }
        else if(this.xOvalDirection == 2) {
            if(this.xOval < 100) {
                this.xOvalDirection = 1;
            }
            else {
                this.xOval--;
            }
        }

        if(this.yOvalDirection == 1) {
            if(this.yOval > 500) {
                this.yOvalDirection = 2;
            }
            else {
                this.yOval++;
            }
        }
        else if(this.yOvalDirection == 2) {
            if(this.yOval < 100) {
                this.yOvalDirection = 1;
            }
            else {
                this.yOval--;
            }
        } */

        for (Actor actor: this.actors
             ) {
            actor.update(delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException { // Was dargestellt werden soll
        /*graphics.drawRect(this.xRectangle,this.yRectangle,100,100);
        graphics.drawString("Hallo Welt!", 100,250);
        graphics.drawOval(this.xOval, 50,100,100);
        graphics.drawOval(100, this.yOval,100,100); */

        for (Actor actor: this.actors
        ) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Objects("Squared Objects"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
