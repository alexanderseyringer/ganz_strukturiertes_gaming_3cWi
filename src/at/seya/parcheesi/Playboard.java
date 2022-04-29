package at.seya.parcheesi;

import org.newdawn.slick.*;

public class Playboard implements Actor{
    private Image playboard;

    public Playboard() throws SlickException {
        playboard = new BigImage("testdata/img/PlayBoard.png", Image.FILTER_NEAREST );
    }

    @Override
    public void render(Graphics graphics) {
        playboard.draw(0,0);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }
}
