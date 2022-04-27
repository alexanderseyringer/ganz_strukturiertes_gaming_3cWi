package at.seya.selfMadeGame;

public class CollissionObject {
    private boolean hasCollission = false;
    private RacingCarComputer racingCarComputer;

    public CollissionObject(boolean hasCollission, RacingCarComputer racingCarComputer) {
        this.hasCollission = hasCollission;
        this.racingCarComputer = racingCarComputer;
    }

    public boolean isHasCollission() {
        return hasCollission;
    }

    public void setHasCollission(boolean hasCollission) {
        this.hasCollission = hasCollission;
    }

    public RacingCarComputer getRacingCarComputer() {
        return racingCarComputer;
    }

    public void setRacingCarComputer(RacingCarComputer racingCarComputer) {
        this.racingCarComputer = racingCarComputer;
    }
}
