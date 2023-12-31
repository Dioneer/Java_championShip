package main.seminar2;

public class Cat extends Animal implements Runner{
    private final String name;
    private final int maxJump;
    private final int maxRun;

    public Cat(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public String runnerName() {
        return name;
    }

    @Override
    public int runnerJump() {
        return this.maxJump;
    }

    @Override
    public int runnerRun() {
        return this.maxRun;
    }
}
