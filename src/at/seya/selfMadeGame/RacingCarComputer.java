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
    private int timeSetBeginner;
    private int timeSetForFollower;
    private int pastTime;
    private Boolean isBeginner;

    public RacingCarComputer(int timeSet, boolean isBeginner) throws SlickException {
        Random random = new Random();
        this.computerRacingCar = new Image("testdata/img/Computer_Car.png");
        scaledCar = computerRacingCar.getScaledCopy(85,165);
        this.x = random.nextInt(800);
        this.y = -200;
        this.timeSetBeginner = timeSet;
        this.pastTime = 0;
        this.timeSetForFollower = random.nextInt(2000)+1000;
        this.isBeginner = isBeginner;
    }

    @Override
    public void render(Graphics graphics) {
        scaledCar.draw(x,y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.pastTime += delta;

        if(isBeginner == true) {
            if (this.timeSetBeginner < this.pastTime) {
                this.y += (float) delta / 1.5;
            }
        }

        else {
            if (this.timeSetForFollower < this.pastTime) {
                this.y+= (float) delta/1.5;
            }
        }

        if(this.x < 420) {
            this.x = 420;
        }

        if(this.y > 725) {
            theGreatReset();
        }

    }

    public void theGreatReset() {
        this.pastTime = 0;

        Random random = new Random();
        this.x = random.nextInt(800);

        if(this.x < 420) {
            this.x = 420;
        }

        this.y = -200;

        this.timeSetBeginner = random.nextInt(2000)+1000;
        this.timeSetForFollower = random.nextInt(2000)+1000;
    }
}
