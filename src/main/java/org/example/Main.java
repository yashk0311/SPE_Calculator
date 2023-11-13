package org.example;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

        public static int add(int a, int b) {
            logger.info("START OP: Add");
            int ans = a + b;
            logger.info("END OP: Add");
            return ans;
        }

        public static int subtract(int a, int b) {
            logger.info("START OP: Subtract");
            int ans = a - b;
            logger.info("END OP: Subtract");
            return a - b;
        }

        public static long multiply(int a, int b) {
            logger.info("START OP: Multiply");
            long ans = (long)a*b;
            logger.info("END OP: Multiply");
            return ans;
        }

        public static float divide(int a, int b) {
            logger.info("START OP: Division");
            float ans = 0;
            if (b != 0) {
                ans = (float)a/b;
                logger.info("END OP: Division");
            } else {
                System.out.println("Error: Division by zero.");
                logger.warn("OP FAILED: Division, failed due to division by 0");
            }
            return ans;
        }
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Start of Execution");
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
                    System.out.println(a + " + " + b + " = " + add(a, b));
                    System.out.println("------------------------------------");
                    break;

                case 2:
                    System.out.println("Please enter 1st operand: ");
                    a = scanner.nextInt();
                    System.out.println("Please enter 2nd operand: ");
                    b = scanner.nextInt();
                    System.out.println("-------------- Result ------------- ");
                    System.out.println(a + " - " + b + " = " + subtract(a, b));
                    System.out.println("------------------------------------");

                    break;

                case 3:
                    System.out.println("Please enter 1st operand: ");
                    a = scanner.nextInt();
                    System.out.println("Please enter 2nd operand: ");
                    b = scanner.nextInt();
                    System.out.println("-------------- Result ------------- ");
                    System.out.println(a + " x " + b + " = " + multiply(a, b));
                    System.out.println("------------------------------------");
                    break;

                case 4:
                    System.out.println("Please enter 1st operand: ");
                    a = scanner.nextInt();
                    System.out.println("Please enter 2nd operand: ");
                    b = scanner.nextInt();
                    System.out.println("-------------- Result ------------- ");
                    System.out.println(a + " / " + b + " = " + divide(a, b));
                    System.out.println("-----------------------------------");
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid option. Please choose a valid operation.");
                    logger.info("Invalid option Selected");
                    break;
            }
        }
    }
}
