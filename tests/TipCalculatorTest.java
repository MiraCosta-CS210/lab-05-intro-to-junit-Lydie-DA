import static org.junit.jupiter.api.Assertions.*;

public class TipCalculatorTest {

    @org.junit.jupiter.api.Test
     void calculateTipTest1() {
        TipCalculator calculator = new TipCalculator();
        double result = calculator.calculateTip(100,20);
        assertEquals(20,result);
    }

    @org.junit.jupiter.api.Test
    void calculateTipTest2() {
        TipCalculator calculator = new TipCalculator();
        double result = calculator.calculateTip(53,15);
        assertEquals(7.95,result);
    }
}
