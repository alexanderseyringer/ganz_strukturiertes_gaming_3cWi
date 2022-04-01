package at.seya.selfMadeGame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class RacingCarUser implements Actor{
    private Image userRacingCar;
    private Image scaledCar;

    public RacingCarUser() throws SlickException {
        this.userRacingCar = new Image("testdata/img/Player_Car.png");
        scaledCar = userRacingCar.getScaledCopy(85,165);
    }

    @Override
    public void render(Graphics graphics) {
        scaledCar.draw(608,540);

    }

    @Override
    public void update(int delta) {

    }
}
