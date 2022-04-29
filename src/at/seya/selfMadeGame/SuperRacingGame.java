package at.seya.selfMadeGame;

import org.newdawn.slick.*;

import java.util.LinkedList;
import java.util.List;


public class SuperRacingGame extends BasicGame{
    private List<Actor> actors;
    private RacingCarUser racingCarUser;
    public SuperRacingGame(String title) {
        super(title);
    }
    public RacingCarComputer racingCarComputer;

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new LinkedList<>();

        Background background = new Background();
        this.actors.add(background);

        this.racingCarUser = new RacingCarUser();
        this.actors.add(racingCarUser);

        RacingCarComputer supaComputer1 = new RacingCarComputer();
        RacingCarComputer supaComputer2 = new RacingCarComputer();
        RacingCarComputer supaComputer3 = new RacingCarComputer();

        supaComputer1.setComputerRacingCar(supaComputer2);
        supaComputer2.setComputerRacingCar(supaComputer3);
        supaComputer3.setComputerRacingCar(supaComputer1);

        racingCarUser.addCollissionCar(supaComputer1);
        racingCarUser.addCollissionCar(supaComputer2);
        racingCarUser.addCollissionCar(supaComputer3);

        this.actors.add(supaComputer1);
        this.actors.add(supaComputer2);
        this.actors.add(supaComputer3);

        supaComputer1.start();
    }

    @Override
    public void update( GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor: this.actors
        ) {
            actor.update(gameContainer, delta);
        }
        CollissionObject collissionObject = this.racingCarUser.hasColission();
        if(collissionObject.isHasCollission()) {

            //System.out.println("KOLISSION WAS TUST DU???"); // For Debugging
            collissionObject.getRacingCarComputer().end(); //Gamecrasher.exe
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: this.actors
        ) {
            actor.render(graphics);
        }

        String score = "Points: " + Integer.toString(this.racingCarUser.getUserScore());
                graphics.drawString(score, 10, 30);

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