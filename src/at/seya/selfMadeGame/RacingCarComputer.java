package at.seya.selfMadeGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import java.util.Random;

public class RacingCarComputer implements Actor{
    private Image computerRacingCar;
    private Image scaledCar;
    private RacingCarComputer nextRacingCarComputer;
    private float x,y;
    private float speed = 1.5f;
    boolean isDriving = false;
    private Shape collisionShape;
    boolean crashed = false;

    public RacingCarComputer() throws SlickException {
        this.computerRacingCar = new Image("testdata/img/Computer_Car.png");
        scaledCar = computerRacingCar.getScaledCopy(85,165);
        setRandomXPosition();
        this.y = -200;
        this.collisionShape = new Rectangle(this.x, this.y,85, 165);
    }

    @Override
    public void render(Graphics graphics) {
        scaledCar.draw(this.x,this.y);
        //graphics.draw(collisionShape);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (this.crashed == false) {
            if (this.y > 400 && this.y < 500) {
                this.nextRacingCarComputer.start();
            }

            if(isDriving) {
                this.y += (float) delta/this.speed;
            }

            if(this.y > 700) {
                this.isDriving = false;
                this.y = -200;
                setRandomXPosition();
                setSpeedFaster();
            }

            this.collisionShape.setX(this.x);
            this.collisionShape.setY(this.y);
        }

    }

    public void start() {
        this.isDriving = true;
    }

    private void setRandomXPosition() {
        this.x = (new Random()).nextInt(350) + 430;
    }

    public void setSpeedFaster() {
        if (this.speed > 0.8) {
            this.speed -= 0.05;
        }
    }

    public void setComputerRacingCar(RacingCarComputer nextRacingCarComputer) {
        this.nextRacingCarComputer = nextRacingCarComputer;
    }

    public Shape getCollisionShape() {
        return collisionShape;
    }

    public void end() {
        this.crashed = true;
    }


}
