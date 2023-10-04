package main.seminar_second;

public class Dog extends BaseDog implements Animal{
    @Override
    public void run() {
        System.out.println("The dog is running");
    }
    @Override
    public void voice(){
        System.out.println("This dog is barking");
    }
}

abstract class BaseDog{

}