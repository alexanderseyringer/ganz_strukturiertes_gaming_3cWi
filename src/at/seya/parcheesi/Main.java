package at.seya.parcheesi;

import org.newdawn.slick.*;

import java.util.LinkedList;
import java.util.List;

public class Main extends BasicGame {
    private List<at.seya.parcheesi.Actor> actorList;
    public Main(String title) {super(title);}
    private int id = 0;

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actorList = new LinkedList<>();

        Playboard playboards = new Playboard();
        this.actorList.add(playboards);

        while (id < 16) {
            if (id < 4) {
                Figures redFigure = new Figures(Figures.COLOR.red, this.id);
                this.actorList.add(redFigure);
                this.id++;
            }

            if (id < 8) {
                Figures blackFigure = new Figures(Figures.COLOR.black, this.id);
                this.actorList.add(blackFigure);
                this.id++;
            }

            if (id < 12) {
                Figures greenFigure = new Figures(Figures.COLOR.green, this.id);
                this.actorList.add(greenFigure);
                this.id++;
            }

            if (id < 16) {
                Figures yellowFigure = new Figures(Figures.COLOR.yellow, this.id);
                this.actorList.add(yellowFigure);
                this.id++;
            }
        }
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
