import java.util.Scanner;
import java.io.*;

class Abcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            if (a > 18) {
                throw new ArithmeticException("Age is greater than 18");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("  gfytdcfgjh,kkri5e     ");   
        }
    }
}