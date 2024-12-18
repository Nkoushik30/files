import java.util.Scanner;

class palindrome
{
    public static int fact(int n)
    {
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to calculate the factorial :");
        int  a=sc.nextInt();
        System.out.println("factorial of the number is :"+fact(a));
    }
}