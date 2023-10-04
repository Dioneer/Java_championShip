package main.seminar_second;

public class Cat extends BaseCat implements Animal{
    @Override
    public void run() {
        System.out.println("The cat is running");
    }
    @Override
    public void voice(){
        System.out.println("This cat is meow");
    }
}
    abstract class BaseCat{
    }
