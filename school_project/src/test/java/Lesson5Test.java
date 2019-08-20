import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lesson5Test {
    static Lesson5 lesson5;
    int a = 1;
    int b = 5;
    int c = 6;
    int d = 7;
    int e = 0;
    int f = -6;

    @BeforeAll
    static void init() {
        System.out.println("Start tests");
        lesson5 = new Lesson5();
    }

    @Test
    public void checkThatTriangle() {
        assertEquals("YES", lesson5.isTriangle(b, c, d), "Check if is triangle with numbers: " + b + "," + c + "," + d);
    }

    @Test
    public void checkThatEvenTriangle() {
        assertEquals("YES", lesson5.isTriangle(b, b, b), "Check if is triangle with numbers: 3 X " + b);
    }

    @Test
    public void checkThatNotTriangle() {
        assertEquals("NO", lesson5.isTriangle(a, b, e), "Check if can not be triangle with numbers: " + a + "," + b + "," + e);
    }

    @Test
    public void checkThatNotTriangleNegative() {
        assertEquals("NO", lesson5.isTriangle(f, a, c), "Check if can not be triangle with numbers:" + f + "," + a + "," + c);
    }

    @AfterAll
    static void init2() {
        System.out.println("Test finish");
        lesson5 = null;
    }
}
