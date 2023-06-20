package OOPs;

//This is Compile-time polymorphism
//Function Overloading

// class Student3{
//     String name;
//     int age;

//     public void display(String name){
//         System.out.println("Name is :" +name);
//     }

//     public void display(int age) {
//         System.out.println(age);
//     }

//     public void display(String name, int age) {
//         System.out.println(name + " " + age);
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////


//Runtime Polymorphism
//Method Overriding

class Parent{
     public void print(){
        System.out.println("Parent Class");
     }
}

class subclass1 extends Parent{
    public void print() {
        System.out.println("subclass 1");
    }
}

class subclass2 extends Parent{
    public void print() {
        System.out.println("subclass 2");
    }
}


public class polymorphism {
    
    public static void main(String[] args) {
        // Student3 s1 = new Student3();
        // s1.name = "Aman";
        // s1.age = 24;

        // s1.display(s1.name, s1.age);

        Parent p = new subclass2();
        p.print();

    }
}
