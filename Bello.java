import java.util.*;
class Hello
{
    public void single()
    {
        System.out.println("hello world");
    }
    
}
class Bello extends Hello
{
    public void Bingle(int a,int b)
    {
        System.out.println("addition of two numbers"+(a+b));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int c=sc.nextInt();
        System.out.println("enter b");
        int d=sc.nextInt();
        Bello obj=new Bello();
        obj.single();
        obj.Bingle(c,d);
    }
}