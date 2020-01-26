package Prog_2_Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        String input1 = scanner.next();
        System.out.println("Enter +, -, *, /, or % :");
        String input2 = scanner.next();
        System.out.println("Enter second number");
        String input3 = scanner.next();
        float a = Float.parseFloat(input1);
        float b = Float.parseFloat(input3);
        float number = 0;

        if (input2.equals("+")) {
            float c = a + b;
            System.out.println("Result: " + c);
        } else if (input2.equals("-")) {
            float c = a - b;
            System.out.println("Result: " + c);
        } else if (input2.equals("*")) {
            float c = a * b;
            System.out.println("Result: " + c);
        } else if (input2.equals("/") && !input3.equals("0")) {
            float c = a / b;
            System.out.println("Result: " + c);
        } else if (input2.equals("%")) {
            float c = a % b;
            System.out.println("Result: " + c);
        } else if (input2.equals("/")) {
            System.err.println("You cannot divide by zero. Please enter any other number:");
            String d = scanner.next();
            float f = Float.parseFloat(d);
            float c = a / f;
            System.out.println("Result: " + c);
        } else {
            throw new ArithmeticException();
        }
    }
}