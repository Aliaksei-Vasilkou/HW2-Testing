package coyclab.github.com.hw_testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    private final Calculator mMockedCalculator = mock(Calculator.class);
    private final Calculator mSpyCalculator = spy(Calculator.class);

    @Test
    public void additionTest() {
        when(mMockedCalculator.addition(2, 3)).thenReturn("5");
        assertEquals(mMockedCalculator.addition(2, 3), "5");
    }

    @Test
    public void subtractingTest() {
        doReturn("2").when(mSpyCalculator).subtraction(5, 3);
        final String result = mSpyCalculator.subtraction(5, 3);
        assertEquals("2", result);
    }

    @Test
    public void divisionTest() {
        when(mMockedCalculator.division(5, 0)).thenThrow(new ArithmeticException());
        try {
            mMockedCalculator.division(5, 0);
            fail("Divide by zero!");
        } catch (final ArithmeticException e) {
            //Good!
        }
    }
}