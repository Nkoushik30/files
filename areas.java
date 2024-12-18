import java.util.*;
abstract class A{
    abstract void square();
}
abstract class B extends A{
    abstract void circle();
}
abstract class C extends B{
    abstract void rectangele();
}
abstract class D extends C{
    abstract void triangel();
}
class Areas extends D{
    Scanner sc=new Scanner(System.in);
    void square()
    {
        System.out.println("enter side length");
        double s=sc.nextDouble();
        System.out.println("the area of square"+(s*s));
    }
    void circle()
    {
        System.out.println("enter radius");
        double c=sc.nextDouble();
        float pi=3.14;
        System.out.println("the area of circle"+(pi*c*c));
    }
    void rectangele()
    {
        System.out.println("enter side length");
        double l=sc.nextDouble();
        System.out.println("enter the breadth");
        double b=sc.nextDouble();
        System.out.println("the area of rectangle is"+(l+b));
 
    }
    void triangle()
    {
    System.out.println("enter side base");
    double ba=sc.nextDouble();
    System.out.println("enter the height");
    double he=sc.nextDouble();
    System.out.println("the area of rectangle is"+(0.5*ba*he));
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the chooce number");
        int choice=sc.nextInt();
        Areas obj=new Areas();
        switch(choice){
            case 1:
                obj.circle();
                break;
            case 2:
                obj.triangel();
                break;
            case 3:
                obj.square();
                break;
            case 4:
                obj.rectangele();
                break; 
            default:
                System.out.println("enter valid number");          
        }
    }
}