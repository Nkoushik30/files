import java.util.*;
class A{
    public void A1()
    {
        System.out.println("parent method");
    }
}
class B extends A1{
    public void B1()
    {
        System.out.println("secount method");
    }
}
class C extends b
{
    public void C1()
    {
        System.out.println("third method");
    }
    public static void main(String[] args)
    {
        C1 obj=new C1();
        obj.A1();
        obj.B1();
        obj.C1();
    }
}