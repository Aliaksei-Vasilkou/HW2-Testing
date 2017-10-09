package coyclab.github.com.hw_testing;

class Calculator implements ICalculator {

    @Override
    public String addition(final int x, final int y) {
        return formatter(x + y);
    }

    @Override
    public String subtraction(final int x, final int y) {
        return formatter(x - y);
    }

    @Override
    public String multiplication(final int x, final int y) {
        return formatter(x * y);
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
