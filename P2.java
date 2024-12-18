import java.util.*;
class P2
{
    public static int pali(int n,int k)
    {
        if(n==0){
            return k;
        }
        else{
            k=k*10+n%10;
            return pali(n/10,k);
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int a=sc.nextInt();
        int a1=pali(a,0);
        System.out.println(pali(a,0));
        if(a==a1){
            System.out.println(a+" is a palindrome");
        }
        else{
            System.out.println(a+" is not a palindrome");
        }
        
    }
}