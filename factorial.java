import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial Number");
        int num = sc.nextInt();
        int fact = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial number is 5" + fact);
    }
}
