package firstjunit;

import firstjunit.Calculator;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int multiply = calc.multiply(2, 4);
        float divide = calc.divide(4, 2);
        System.out.println(multiply);
        System.out.println(divide);
    }
}