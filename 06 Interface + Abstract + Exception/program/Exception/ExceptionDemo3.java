
class ExceptionDemo3 {

    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 0;

        if (denominator == 0) {
            // Manually throw an ArithmeticException
            throw new ArithmeticException("Cannot divide by zeroooo");
        } else {
            System.out.println(numerator / denominator);
        }
    }
}
