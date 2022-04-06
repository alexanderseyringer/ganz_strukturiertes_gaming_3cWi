package at.seya.selfMadeGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import java.util.Random;

public class RacingCarComputer implements Actor{
    private Image computerRacingCar;
    private Image scaledCar;
    private float x,y;
    private int speedyGonzales;

    public RacingCarComputer() throws SlickException {
        Random random = new Random();
        this.computerRacingCar = new Image("testdata/img/Computer_Car.png");
        scaledCar = computerRacingCar.getScaledCopy(85,165);
        this.x = random.nextInt(800);
        this.y = 0;

    }

    @Override
    public void render(Graphics graphics) {
        scaledCar.draw(x,y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y+= (float) delta/2;

        if(this.x < 420) {
            this.x = 420;
        }
    }
}
