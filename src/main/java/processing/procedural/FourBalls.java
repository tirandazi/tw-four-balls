package processing.procedural;

import processing.core.PApplet;

public class FourBalls extends PApplet{

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public int ballOneX = 0;
    public int ballTwoX = 0;
    public int ballThreeX = 0;
    public int ballFourX = 0;
    public int speedX = 1;


    public static void main(String[] args) {
        PApplet.main("processing.procedural.FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(ballOneX, getYPosition(1), 10, 10);
        ballOneX += speedX;

        ellipse(ballTwoX, getYPosition(2), 10, 10);
        ballTwoX += 2 * speedX;

        ellipse(ballThreeX, getYPosition(3), 10, 10);
        ballThreeX += 3 * speedX;

        ellipse(ballFourX, getYPosition(4), 10, 10);
        ballFourX += 4 * speedX;
    }

    private static int getYPosition(int unitsFromTop) {
        return HEIGHT * unitsFromTop / 5;
    }
}
