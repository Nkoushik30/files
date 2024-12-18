import java.util.*;
class Num_1
{
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        int b=0;
        while(n>0){
            int rem=n%10;
            System.out.print(rem);
            n/=10;
        }
    }
}