package coyclab.github.com.hw_testing;

class Calculator implements ICalculator {

    private int result;

    @Override
    public String addition(final int x, final int y) {
        result = x + y;
        return formatter(result);
    }

    @Override
    public String subtraction(final int x, final int y) {
        result = x - y;
        return formatter(result);
    }

    @Override
    public String multiplication(final int x, final int y) {
        result = x * y;
        return formatter(result);
    }

    @Override
    public String division(final int x, final int y) {
        if (y == 0) {
            throw new ArithmeticException();
        }
        return formatter(x / y);
    }

    private String formatter(final int value) {
        return String.valueOf(value);
    }
}
