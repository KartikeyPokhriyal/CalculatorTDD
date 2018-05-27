import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


    public class CalculatorTest {

        Calculator calculator;
        List<Integer> listOfIntegers;

        @Before

        public void setUp() {
            calculator = new Calculator();
            listOfIntegers = Arrays.asList(1,3,5,6);
        }


        @Test

        public void returnMinimumOfAListOfIntegersWhenListIsPassed() {

            assertEquals(1, calculator.calculateMinimum(listOfIntegers));
        }

        @Test

        public void returnMaximumOfAListOfIntegersWhenListIsPassed() {

            assertEquals(6, calculator.calculateMaximum(listOfIntegers));
        }

        @Test

        public void returnAverageOfAListOfIntegersWhenListIsPassed() {

            assertEquals("3.75",String.valueOf(calculator.calculateAverage(listOfIntegers)));
        }
    }
