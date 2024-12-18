import java.util.*;
class A {
    double s = 20000;

    public void Display() {
        System.out.println("Multi-level inheritance salary: " + s);
    }
}

class B extends A {
    public void print() {
        System.out.println("Print method: " + super.s);
    }
}

class C1 extends B {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.Display();
        obj.print();
    }
}
