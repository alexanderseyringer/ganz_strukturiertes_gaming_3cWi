package at.seya.selfMadeGame;

import at.seya.games.objects.Objects;
import org.newdawn.slick.*;

import java.util.LinkedList;
import java.util.List;

public class SuperRacingGame extends BasicGame{
    private List<Actor> actors;
    public SuperRacingGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new LinkedList<>();
        Background background = new Background();
        this.actors.add(background);

        RacingCarUser husbild = new RacingCarUser();
        this.actors.add(husbild);

        RacingCarComputer supaComputer = new RacingCarComputer();
        this.actors.add(supaComputer);
    }

    @Override
    public void update( GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor: this.actors
        ) {
            actor.update(gameContainer, delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: this.actors
        ) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new SuperRacingGame("SuperRacingGame"));
            container.setDisplayMode(1280,720,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}