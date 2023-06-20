package OOPs;
interface Animal1{
    int eyes = 2;
    void walk();
}
interface Herbivore{
    void eats();
}

class Elephant implements Animal1, Herbivore{
    @Override
    public void eats() {
        System.out.println("Elephant eats");
        
    }
    @Override
    public void walk() {
        System.out.println("Elephant walks");
        
    }
}

public class multipleInheritance {
   public static void main(String[] args) {
    Elephant e = new Elephant();
    e.eats();
    e.walk();


   
   } 
}
