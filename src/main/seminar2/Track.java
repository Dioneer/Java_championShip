package main.seminar2;

public class Track extends Obstacle{
    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    int getLength() {
        return length;
    }

    @Override
    int getHeight() {
        return 0;
    }
}
