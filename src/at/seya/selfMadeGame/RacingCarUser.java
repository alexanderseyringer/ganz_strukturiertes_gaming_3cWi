package at.seya.selfMadeGame;

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
        graphics.draw(collisionShape);
    }



    @Override
    public void update(GameContainer gameContainer, int delta) {
        if(this.isCrashed == false) {
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

    public boolean hasColission() {
        for (RacingCarComputer car: this.racingCarComputers) {
            if(car.getCollisionShape().intersects(this.collisionShape)){
                this.isCrashed = true;
                return true;
            }
        }
        return false;
    }
}
