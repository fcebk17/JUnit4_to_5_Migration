package ntou.cse.soselab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathServiceTest {

    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathService();
    }

    @After
    public void tearDown() {
        mathService = null;
    }

    @Test
    public void testAdd() {
        int result = mathService.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void testSubtract() {
        int result = mathService.subtract(20, 10);
        assertEquals(10, result);
    }

    @Test
    public void testMultiply() {
        int result = mathService.multiply(3, 4);
        assertEquals(12, result);
    }

}
