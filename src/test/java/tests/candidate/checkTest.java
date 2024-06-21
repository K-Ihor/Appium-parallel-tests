package tests.candidate;

import org.testng.annotations.Test;
import tests.BaseTest;

public class checkTest extends BaseTest {
    @Test
    public void checkParallelTest() {
        try {
            Thread.sleep(5000); // Подождать 5 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}