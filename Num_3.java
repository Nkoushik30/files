import java.util.*;
class Num_3
{
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}