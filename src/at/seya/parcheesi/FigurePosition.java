package at.seya.parcheesi;

public class FigurePosition {
    public PositionPoint getPositionPoint(int Id) {
        PositionPoint point = new PositionPoint();

        if (Id == 0) {
            point.setX(61);
            point.setY(61);
        }
        else if (Id == 1){
            point.setX(147);
            point.setY(61);
        }
        else if (Id == 2){
            point.setX(61);
            point.setY(142);
        }
        else if (Id == 3){
            point.setX(147);
            point.setY(142);
        }
        else if (Id == 4){
            point.setX(787);
            point.setY(61);
        }
        else if (Id == 5){
            point.setX(868);
            point.setY(61);
        }
        else if (Id == 6){
            point.setX(787);
            point.setY(142);
        }
        else if (Id == 7){
            point.setX(868);
            point.setY(142);
        }
        else if (Id == 8){
            point.setX(61);
            point.setY(780);
        }
        else if (Id == 9){
            point.setX(142);
            point.setY(780);
        }
        else if (Id == 10){
            point.setX(61);
            point.setY(868);
        }
        else if (Id == 11){
            point.setX(142);
            point.setY(868);
        }
        else if (Id == 12){
            point.setX(786);
            point.setY(779);
        }
        else if (Id == 13){
            point.setX(868);
            point.setY(779);
        }
        else if (Id == 14){
            point.setX(786);
            point.setY(860);
        }
        else if (Id == 15){
            point.setX(860);
            point.setY(858);
        }
        return point;

    }
}