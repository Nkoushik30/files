import java.util.*;
class Arm
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    int temp=n;
    int rem=0;
    int digit;
    while(n>0)
    {
        digit=n%10;
        rem=rem+(digit*digit*digit);
        n=n/10;
    }
    if(rem==temp)
    {
        System.out.println("yes");
    }
    else
    {
        System.out.println("no");
    }
}
}