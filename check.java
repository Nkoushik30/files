class First extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
        System.out.println("hi");
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception a)
        {
            System.out.println(a);
        }
        }
        
    }
}
class secound extends Thread
{
    public void run()
    {
        for(int j=0;j<=5;j++)
        {
             System.out.println("good morning");
             try
             {
                 Thread.sleep(1000);
             }
             catch(Exception b)
             {
                 System.out.println(b);
             }
        }
       
        
    }
}
public class check
{
    public static void main(String args[])throws Exception
    {
        First f=new First();
        secound s=new secound();
        f.start();
        s.start();
        System.out.println(f.isAlive());
        f.join();
        s.join();
        System.out.println(s.isAlive());
        System.out.println("good bye");
    }
}