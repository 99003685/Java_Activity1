
import java.util.*;
import java.io.*;

public class Arithmetic_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number");
        int a = sc.nextInt();
System.out.println("Enter the second number");
        int b = sc.nextInt();
System.out.println("Enter the operation option");
        int n = sc.nextInt();
        if (n < 5 && n > 0 && a > 0 && b > 0 && a < 32767 && b < 32767) {
            switch (n) {
                case 1:

                    System.out.println("Result"+(a + b));
                    break;

                case 2:

                    System.out.println("Result"+(a - b));
                    break;

                case 3:

                    System.out.println("Result"+(a * b));
                    break;

                case 4:

                    System.out.println("Result"+(a / b));
                    break;
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
