package main.seminar_third;

public interface Runner {

    String getName();
    int getMaxRun();
    int getMaxJump();
    default boolean jump(int height) {
        if(height<=getMaxJump()){
            System.out.printf("%s jumped over through the wall %d sm\n", getName(), height);
            return true;
        }else{
            System.out.printf("%s not jumped over the wall %d sm\n",getName(), height);
            return false;
        }
    }
    default boolean run(int length) {
        if(length<=getMaxRun()){
            System.out.printf("%s run through the wall %d sm\n", getName(), length);
            return true;
        }else{
            System.out.printf("%s not run through the wall %d sm\n",getName(), length);
            return false;
        }
    };
}