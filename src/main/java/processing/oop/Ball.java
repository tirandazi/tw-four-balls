package processing.oop;

public class Ball {
    public int positionX;
    public int positionY;
    public int width;
    public int height;

    Ball(int positionX, int positionY, int width, int height) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
    }

    public void updatePosition(char direction, int speedFactor, int speedUnit) {
        switch (direction) {
            case 'x':
                this.positionX += speedFactor * speedUnit;
                break;
            case 'y':
                this.positionY += speedFactor * speedUnit;
                break;
        }
    }
}
