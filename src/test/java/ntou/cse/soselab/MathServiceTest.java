package ntou.cse.soselab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
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
}
