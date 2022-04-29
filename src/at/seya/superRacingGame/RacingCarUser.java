package at.seya.superRacingGame;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import java.util.ArrayList;
import java.util.List;

public class RacingCarUser implements Actor{
    private Image userRacingCar;
    private Image scaledCar;
    private float x,y;
    private float speed = 1f;
    private Shape collisionShape;
    private List<RacingCarComputer> racingCarComputers;
    boolean isCrashed = false;
    private int userScore = 0;

    public RacingCarUser() throws SlickException {
        this.userRacingCar = new Image("testdata/img/Player_Car.png");
        scaledCar = userRacingCar.getScaledCopy(85,165);
        this.x = 608;
        this.y = 540;
        this.collisionShape = new Rectangle(this.x, this.y,85, 165);
        this.racingCarComputers = new ArrayList<RacingCarComputer>();
    }

    @Override
    public void render(Graphics graphics) {
        scaledCar.draw(x,y);
        //temporärus
        //graphics.draw(collisionShape);

        if(this.isCrashed) {
            String snarl = "Hehe back to start";
            graphics.drawString(snarl, 570, 300);
        }
    }



    @Override
    public void update(GameContainer gameContainer, int delta) {
        if(this.isCrashed == false) {
            this.userScore += delta;
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

        this.collisionShape.setX(this.x);
        this.collisionShape.setY(this.y);

    }

    public void addCollissionCar(RacingCarComputer racingCarComputer) {
        this.racingCarComputers.add(racingCarComputer);
    }

    public CollissionObject hasColission() {
        for (RacingCarComputer car: this.racingCarComputers) {
            if(car.getCollisionShape().intersects(this.collisionShape)){
                this.isCrashed = true;
                CollissionObject co = new CollissionObject(true, car);
                return co;
            }
        }
        return new CollissionObject(false, null);
    }

    public int getUserScore() {
        return userScore;
    }
}
