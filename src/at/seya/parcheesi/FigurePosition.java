package at.seya.parcheesi;

public class FigurePosition {
    public PositionPoint getPositionPoint(int Id) {
        PositionPoint point = new PositionPoint();

        if (Id == 0) {
            point.setX(55);
            point.setY(55);
        }
        else if (Id == 1){
            point.setX(135);
            point.setY(55);
        }
        else if (Id == 2){
            point.setX(55);
            point.setY(135);
        }
        else if (Id == 3){
            point.setX(135);
            point.setY(135);
        }
        else if (Id == 4){
            point.setX(775);
            point.setY(55);
        }
        else if (Id == 5){
            point.setX(855);
            point.setY(55);
        }
        else if (Id == 6){
            point.setX(775);
            point.setY(135);
        }
        else if (Id == 7){
            point.setX(855);
            point.setY(135);
        }
        else if (Id == 8){
            point.setX(55);
            point.setY(775);
        }
        else if (Id == 9){
            point.setX(135);
            point.setY(775);
        }
        else if (Id == 10){
            point.setX(55);
            point.setY(855);
        }
        else if (Id == 11){
            point.setX(135);
            point.setY(855);
        }
        else if (Id == 12){
            point.setX(775);
            point.setY(775);
        }
        else if (Id == 13){
            point.setX(855);
            point.setY(775);
        }
        else if (Id == 14){
            point.setX(775);
            point.setY(855);
        }
        else if (Id == 15){
            point.setX(855);
            point.setY(855);
        }
        return point;

    }
}