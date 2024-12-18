import java.util.*;
class Age
{
    public void valid(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("not eligible");
        }
        else
        {
            System.out.println("eligible");
        }
    }
    public static void main(String args[])
    {
        Age obj=new Age();
        obj.valid(15);
    }
}