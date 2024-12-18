import java.util.*;
class Q
{
public static void main(String args[] )
{
    try
    {
    int a=10;
    int b=0;
    System.out.println(a/b);
    }
    catch(Exception a)
    {
        System.out.println(a);
    }
    finally{
        System.out.println("code excecuted");
    }
}

}