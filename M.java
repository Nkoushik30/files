import java.util.*;

class M {
    public static void main(String args[]) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b); // This will throw an exception
        } 
        catch (ArithmeticException r) { // Corrected spelling
            System.out.println("hello"); // Catches division by zero
        } 
        catch (Exception r) { // General exception catch
            System.out.println(r);
        } 
        finally {
            System.out.println("code executed");
        }
    }
}
