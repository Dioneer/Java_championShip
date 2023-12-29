package main.seminar2;

public interface Runner {
    String runnerName();
    int runnerJump();
    int runnerRun();
    default boolean jump(int height) {
        if(height<=runnerJump()) {
            System.out.println("This runner "+runnerName()+" has passed an obstacle");
            return true;
        }else{
            System.out.println("This runner "+runnerName()+" has fail");
            return false;
        }
    }
    default boolean run(int run) {
        if(run<=runnerRun()) {
            System.out.println("This runner "+runnerName()+" has passed an obstacle");
            return true;
        }else{
            System.out.println("This runner "+runnerName()+" has fail");
            return false;
        }
    }
}
