package at.seya.parcheesi;

import org.newdawn.slick.Color;
public class FigureColor {
    public static Color getFigureColor(Figures.COLOR color) {
        switch (color) {
            case red:
                return new Color(255, 50, 50);
            case gray:
                return new Color(117, 117, 117);
            case yellow:
                return new Color(255, 255, 82);
            case green:
                return new Color(0, 180,0);
        }
        return new Color(Color.cyan);
    }
}
