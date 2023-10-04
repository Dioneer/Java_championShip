package main.seminar2;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice(){
        System.out.println("This dog is barking");
    }
}
