package OOPs;

abstract class Animal{
    abstract public void walk();
    Animal(){
        System.out.println("Animal Created");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse created");
    }
    @Override
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}
