package org.example;
import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public long multiply(int a, int b) {
        return (long) a * b;
    }

    public float divide(int a, int b) {
        if (b != 0) {
            return (float) a / b;
        } else {
            System.out.println("Error: Division by zero.");
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and welcome to the Calculator Program!");
        while (true) {
            System.out.println("Choose from the below operations: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int option = scanner.nextInt();
            int a, b;
            switch (option) {
                case 1:
                    System.out.println("Please enter 1st operand: ");
                    a = scanner.nextInt();
                    System.out.println("Please enter 2nd operand: ");
                    b = scanner.nextInt();
                    System.out.println("-------------- Result ------------- ");
                    System.out.println(a + " + " + b + " = " + calculator.add(a, b));
                    System.out.println("------------------------------------");
                    break;

                case 2:
                    System.out.println("Please enter 1st operand: ");
                    a = scanner.nextInt();
                    System.out.println("Please enter 2nd operand: ");
                    b = scanner.nextInt();
                    System.out.println("-------------- Result ------------- ");
                    System.out.println(a + " - " + b + " = " + calculator.subtract(a, b));
                    System.out.println("------------------------------------");
                    break;

                case 3:
                    System.out.println("Please enter 1st operand: ");
                    a = scanner.nextInt();
                    System.out.println("Please enter 2nd operand: ");
                    b = scanner.nextInt();
                    System.out.println("-------------- Result ------------- ");
                    System.out.println(a + " x " + b + " = " + calculator.multiply(a, b));
                    System.out.println("------------------------------------");
                    break;

                case 4:
                    System.out.println("Please enter 1st operand: ");
                    a = scanner.nextInt();
                    System.out.println("Please enter 2nd operand: ");
                    b = scanner.nextInt();
                    System.out.println("-------------- Result ------------- ");
                    System.out.println(a + " / " + b + " = " + calculator.divide(a, b));
                    System.out.println("-----------------------------------");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid option. Please choose a valid operation.");
                    break;
            }
        }
    }
}
