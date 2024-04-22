package processing.oop;

import processing.core.PApplet;

public class MotionBalls extends PApplet {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    private final int horizontalSpeedUnit = 1;
    private final int numberOfBalls = 4;
    private final Ball[] balls = new Ball[numberOfBalls];
    private final int totalBlocks = numberOfBalls + 1;

    public MotionBalls() {
        for (int i = 0; i < numberOfBalls; i++) {
            balls[i] = new Ball(0, getYPosition(i + 1), 10, 10);
        }
    }

    private int getYPosition(int blockFromTop) {
        return HEIGHT * blockFromTop / totalBlocks;
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int i = 0; i < numberOfBalls; i++) {
            drawHorizontalMotionCircle(balls[i], i + 1);
        }
    }

    private void drawHorizontalMotionCircle(Ball ball, int speedFactor) {
        ellipse(ball.positionX, ball.positionY, ball.width, ball.height);
        ball.updatePosition('x', speedFactor, horizontalSpeedUnit);
    }
}
