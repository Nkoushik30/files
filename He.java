import java.util.*;

class A {
    public void a1() {
        System.out.println("parent method");
    }
}

class B extends A {
    public void b1() {
        System.out.println("second method");
    }
}

class He extends B {
    public void c1() {
        System.out.println("third method");
    }

    public static void main(String[] args) {
        He obj = new He();
        obj.a1();  // Call the method from class A
        obj.b1();  // Call the method from class B
        obj.c1();  // Call the method from class C
    }
}