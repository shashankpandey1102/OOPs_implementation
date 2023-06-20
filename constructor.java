package OOPs;

class Student2{
    String name;
    int age;

    Student2(){                                                                     //Non-Parameterized Constructor
        //System.out.println("Constructor Called");
    }

    // Student2(String name, int age){                                                 //Parameterized Constructor
    //     this.name = name;
    //     this.age = age;
    // }

    public void getInfo() {
        System.out.println("Name is " + this.name);
        System.out.println("Age is " + this.age);
    }

    Student2(Student2 s2){                                                           //Copy Constructor
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class constructor {
    public static void main(String[] args) {
     Student2 s1 = new Student2();
     s1.name = "Aman";
     s1.age = 24;
     //s1.getInfo();   

      Student2 s2 = new Student2(s1); 
      s2.getInfo();
    }
}
