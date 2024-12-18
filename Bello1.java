import java.util.*;
interface A
{
     void A1();
     void B1();
}
class Bello1 implements A
{
   public void A1()
    {
        System.out.println("hello praveen");
    }
    public void B1()
    {
        System.out.println("hello padidapu");
    }
    public static void main(String args[])
    {
        Bello1 obj=new Bello1();
        obj.A1();
        obj.B1();
    }
}