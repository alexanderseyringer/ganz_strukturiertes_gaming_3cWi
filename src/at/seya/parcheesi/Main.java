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

        while (this.id < 16) {
            if (this.id < 4) {
                Figures yellowFigure = new Figures(Figures.COLOR.yellow, this.id);
                this.actorList.add(yellowFigure);
                this.id++;
            }

            else if (3 < this.id && this.id < 8) {
                Figures greenFigure = new Figures(Figures.COLOR.green, this.id);
                this.actorList.add(greenFigure);
                this.id++;
            }

            if (7 < this.id && this.id < 12) {
                Figures grayFigure = new Figures(Figures.COLOR.gray, this.id);
                this.actorList.add(grayFigure);
                this.id++;
            }

            if (11 < this.id && this.id < 16) {
                Figures redFigure = new Figures(Figures.COLOR.red, this.id);
                this.actorList.add(redFigure);
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
