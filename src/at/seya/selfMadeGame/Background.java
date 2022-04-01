package at.seya.selfMadeGame;

import org.newdawn.slick.*;

public class Background implements Actor{
    private Image backgroundImage;
    private Image anotherImage;

    public Background() throws SlickException {
        backgroundImage = new BigImage("testdata/img/Straße.png", Image.FILTER_NEAREST );
    }

    @Override
    public void render(Graphics graphics) {
        backgroundImage.draw(0,0);
    }

    @Override
    public void update(int delta) {

    }
}
