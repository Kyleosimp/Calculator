package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator numbers = new Calculator(8.0, 4.0);
        System.out.println(numbers.Add());
        System.out.println(numbers.Subtract());
        System.out.println(numbers.Multiply());
        System.out.println(numbers.Divide());
        System.out.println(numbers.square());
        System.out.println(numbers.squareRoot());
        System.out.println(numbers.exponents());
    }
}
