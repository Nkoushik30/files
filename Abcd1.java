import java.util.Scanner;

class Abcd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int i = 0;
        int j = a.length() - 1;
        
        while (i < j) {
            if (a.charAt(i) != a.charAt(j)) {
                System.out.println("not a palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("palindrome");
    }
}
