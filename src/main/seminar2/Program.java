package main.seminar2;

public class Program {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Barsik");
        Animal dog1 = new Dog("Dryzhock");
        Animal[] animals = new Animal[2];
        animals[0] = cat1;
        animals[1] = dog1;
        processVoice(animals);
    }

    public static void processVoice(Animal[] animals ){
        for (Animal animal : animals) {
            if(animal instanceof Cat cat){
                cat.setColor("Black");
                System.out.println(cat.getColor());
            }
            animal.voice();
        }
    }
}
