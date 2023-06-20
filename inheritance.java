package OOPs;

class shape{
    public void area() {
        System.out.println("Displays Area");
    }
}

class Triangle extends shape{
    public void area2(int b, int h) {
        System.out.println((1/2)*b*h);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
    }
}
