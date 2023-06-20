package OOPs;
//Classes  and Objects

class Pen{
    String color;                               //Data Member
    String type;

    public void getColor(){                     //Member Function
        System.out.println("Colour is " + this.color);
    }

    public void write() {
        System.out.println("Write Something");
    }
}

class Student {
    String name;
    int age;

    public void getInfo() {
        System.out.println("Name is " + this.name);
        System.out.println("Age is " + this.age);
    }
}

public class OOPs {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.color = "Red";
        
        // Pen p2 = new Pen();
        // p2.color = "Blue";

        // p1.getColor();
        // p2.getColor();


        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;

        Student s2 = new Student();
        s2.name = "Shashank";
        s2.age = 24;

        s1.getInfo();
        s2.getInfo();
    }
}
