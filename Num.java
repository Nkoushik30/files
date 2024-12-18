import java.util.*;
class Num
{
    public static void main(String []args)
    {
        double n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextDouble();
        double sum=0,t=n,k=n;
        double i=0;
        while(n!=0){
            double rem=n%10;
            i+=1;
            n/=10;
        }

                while(t!=0){
                    double rem1=t%10;
                    sum=sum+Math.pow(, i);
                    t/=10;
                }

        if(k==sum){
            System.out.println("The number is a palindrome:"+n);
        }
        else{
            System.out.println("Number is not a palindrome:"+n);
        }
    }
}