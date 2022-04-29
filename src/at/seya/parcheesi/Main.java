package at.seya.parcheesi;

import org.newdawn.slick.*;

import java.util.LinkedList;
import java.util.List;

public class Main extends BasicGame {
    private List<at.seya.parcheesi.Actor> actorList;
    public Main(String title) {super(title);}

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actorList = new LinkedList<>();

        Playboard playboards = new Playboard();
        this.actorList.add(playboards);

        Figures figureOne = new Figures();
        this.actorList.add(figureOne);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (at.seya.parcheesi.Actor actor: this.actorList
        ) {
            actor.update(gameContainer, delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: this.actorList
        ) {
            actor.render(graphics);
        }
    }

    public static void main(String[] args) {
        try {
            AppGameContainer container = new AppGameContainer(new Main("Parcheesi"));
            container.setDisplayMode(958,960,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
