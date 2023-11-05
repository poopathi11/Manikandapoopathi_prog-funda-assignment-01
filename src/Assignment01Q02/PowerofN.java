package Assignment01Q02;

import java.util.Scanner;

public class PowerofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of X: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        double result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is " + result);

        scanner.close();
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        return x * power(x, n - 1);
    }
		

	}