import java.util.*;
class Num_4
{
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n between 1-3 digits:");
        n=sc.nextInt();
        int c=0,r=0;
        double n1=n;
        while(n>0){
            r=n%10;
            c=c+1; 
            n=n/10;
        }
        System.out.println("count:"+c);
        int h=c;
        if(h==1){
            System.out.println("Every single digit number is a palindrome:"+n1);
        }
        else if(h==2){
            double d=0;
            while(n1>0){
            double b=n1%10;
            d=d+Math.pow(b,2);
            n1/=10;
            }
            System.out.println(d);
            if(d==n1){
                System.out.println("n is a palindrome:"+n1);
            }
            else{
                System.out.println("n is not a palindrome:"+n1);
            }
        }
        else if(h==3){
            double f=0;
            while(n1>0){
                double k=n1%10;
                f=f+Math.pow(k,3);
                n1/=10;
            }
            System.out.println(f);
            if(f==n1){
                System.out.println("n is a palindrome:"+n1);
            }
            else{
                System.out.println("n is not a palindrome:"+n1);
            }
        }
    }
}