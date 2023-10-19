package org.example;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome to the Calculator Program!");
        System.out.println();
        while(true)
        {
            System.out.println("Choose from the below operations: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            int a, b;
            switch (option){
                case 1:
                    System.out.println("Please enter 1st operand: ");
                    a = scanner.nextInt();
                    System.out.println("Please enter 2nd operand: ");
                    b = scanner.nextInt();


                    System.out.println("-------------- Result ------------- ");
                    System.out.print(a);
                    System.out.print(" + ");
                    System.out.print(b);
                    System.out.print(" = ");
                    System.out.print(a+b);
                    System.out.println();
                    System.out.println("------------------------------------");
                    break;

                case 2:
                    System.out.println("Please enter 1st operand: ");
                    a = scanner.nextInt();
                    System.out.println("Please enter 2nd operand: ");
                    b = scanner.nextInt();

                    System.out.println("-------------- Result ------------- ");
                    System.out.print(a);
                    System.out.print(" - ");
                    System.out.print(b);
                    System.out.print(" = ");
                    System.out.print(a-b);
                    System.out.println();
                    System.out.println("------------------------------------");
                    break;

                case 3:
                    System.out.println("Please enter 1st operand: ");
                    a = scanner.nextInt();
                    System.out.println("Please enter 2nd operand: ");
                    b = scanner.nextInt();

                    System.out.println("-------------- Result ------------- ");
                    System.out.print(a);
                    System.out.print(" x ");
                    System.out.print(b);
                    System.out.print(" = ");
                    System.out.print((long)a*b);
                    System.out.println();
                    System.out.println("------------------------------------");
                    break;

                case 4:
                    System.out.println("Please enter 1st operand: ");
                    a = scanner.nextInt();
                    System.out.println("Please enter 2nd operand: ");
                    b = scanner.nextInt();

                    System.out.println("-------------- Result ------------- ");
                    System.out.print(a);
                    System.out.print(" / ");
                    System.out.print(b);
                    System.out.print(" = ");
                    System.out.print((float)a/b);
                    System.out.println();
                    System.out.println("------------------------------------");
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }
}