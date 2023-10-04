package main.seminar2;

public class Cat extends Animal{
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice(){
        System.out.println("This cat is meowing");
    }
}
