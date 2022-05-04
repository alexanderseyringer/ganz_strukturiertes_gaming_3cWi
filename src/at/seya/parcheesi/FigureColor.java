package at.seya.parcheesi;

import org.newdawn.slick.Color;
public class FigureColor {
    public static Color getFigureColor(Figures.COLOR color) {
        switch (color) {
            case red:
                return new Color(Color.red);
            case black:
                return new Color(Color.black);
            case green:
                return new Color(Color.green);
            case yellow:
                return new Color(Color.yellow);
        }
        return new Color(Color.cyan);
    }
}
