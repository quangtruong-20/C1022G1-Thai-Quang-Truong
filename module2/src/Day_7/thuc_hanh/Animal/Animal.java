package Day_7.thuc_hanh.Animal;

public abstract class Animal {
    public abstract String makeSound();
}

class Tiger extends Animal {

    @Override
    public String makeSound() {
        return "Tiger: gaow gaow";
    }

}
interface Edible{
    String howToEat();
}
class Chicken extends Animal implements Edible{
    public String makeSound(){
        return "Chicken: chip chip";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}


abstract class Fruit implements Edible{}

class Apple extends Fruit{

    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
class Orange extends Fruit{

    @Override
    public String howToEat() {
        return "orange could be juiced";
    }
}