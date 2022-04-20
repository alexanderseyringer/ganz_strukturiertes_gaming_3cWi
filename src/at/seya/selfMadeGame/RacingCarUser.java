package at.seya.selfMadeGame;

import org.newdawn.slick.*;

public class RacingCarUser implements Actor{
    private Image userRacingCar;
    private Image scaledCar;
    private float x,y;
    private float speed = 1f;

    public RacingCarUser() throws SlickException {
        this.userRacingCar = new Image("testdata/img/Player_Car.png");
        scaledCar = userRacingCar.getScaledCopy(85,165);
        this.x = 608;
        this.y = 540;
    }

    @Override
    public void render(Graphics graphics) {
        scaledCar.draw(x,y);

    }



    @Override
    public void update(GameContainer gameContainer, int delta) {
        if(gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
            if (this.x < 790) {
                this.x+= delta /this.speed;
            }
        }

        if(gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
            if (this.x > 420) {
                this.x-= delta /this.speed;
            }
        }
    }
}
