package ntou.cse.soselab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MathServiceTest {

    @Autowired
    private MathService mathService;

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
