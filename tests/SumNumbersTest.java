import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumNumbersTest {

    @org.junit.jupiter.api.Test
    void sumNumbersTest1() {
        SumNumbers sum = new SumNumbers();
        int result = sum.sumIsEven(1,1);
        assertEquals(1,result);
    }
    @org.junit.jupiter.api.Test
    void sumNumbersTest2() {
        SumNumbers sum = new SumNumbers();
        int result = sum.sumIsEven(1,2);
        assertEquals(0,result);
    }



}


