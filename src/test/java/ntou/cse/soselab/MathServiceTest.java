package ntou.cse.soselab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class MathServiceTest {

    private static MathService mathService; // 必須為 static

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // 這個方法會在所有測試方法執行之前執行，且只會執行一次
        System.out.println("Executing setUpBeforeClass");
        mathService = new MathService();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        // 這個方法會在所有測試方法執行之後執行，且只會執行一次
        System.out.println("Executing tearDownAfterClass");
        mathService = null;
    }

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
