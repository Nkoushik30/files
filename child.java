import java.util.*;
class parent
{
    int salary=10;
}
class child extends parent
{

    int salary=20;
    public void display()
    {
    System.out.println(super.salary);
    System.out.println(super.salary);
    }
    public static void main(String[] args)
    {
        child obj=new child();
        obj.display();
    }
}