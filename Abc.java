import java.util.*;
class Abc
{
    Abc(int a,int b)
    {
        System.out.println("Addition:"+(a+b));
    }
    Abc(int a,int b,int  c)
    {
        System.out.println("Addition:"+(a+b+c));
    }
    public static void main(String []args){
        Abc obj1=new Abc(4,5);
        Abc obj2=new Abc(4,5,6);
    }
}