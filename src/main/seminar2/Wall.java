package main.seminar2;

public class Wall extends Obstacle{
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    int getLength() {
        return 0;
    }

    @Override
    int getHeight() {
        return height;
    }
}
