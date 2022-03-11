package at.seya.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import javax.swing.plaf.basic.BasicArrowButton;

public class Rectangles extends BasicGame {
    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException { // First things

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException { // Bewegungen

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException { // Was dargestellt werden soll
        graphics.drawRect(100,100,100,100);
        graphics.drawString();
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Squared Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
