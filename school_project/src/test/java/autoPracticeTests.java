import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class autoPracticeTests {

    @Test
    public void checkWhoCanEatMoreTest() {
        String name = "Elina";
        int numberOfHinkalis = 20;
        String expected = "Can eat only " + numberOfHinkalis + " , " + name + " need to train more";
        assertEquals(expected, autoPractice.checkWhoCanEatMore(name, numberOfHinkalis));
    }

    @Test
    public void check() {
        int start = 5;
        int end = 9;
        int number = 6;
        int exp = 0;
        assertEquals(exp, autoPractice.isNumberInRange(start, end, number));
    }

    @Test
    public void checkWhoCan() {
        String name1 = "Luka";
        String name2 = "Vasja";

        assertEquals("Can eat only 20 , " + name1 + " need to train more", autoPractice.checkWhoCanEatMore(name1, 20));
        assertEquals(name2 + " The great can eat: 100", autoPractice.checkWhoCanEatMore(name2, 100));
    }

    @Test
    public void isFivePrime() {
        int num = 5;
        Boolean expected = true;
        Boolean actual = autoPractice.isPrime(num);
        assertEquals(expected, actual);
    }

    @Test
    public void isPrimeZero() {
        int num = 0;
        Boolean expected = null;
        Boolean actual = autoPractice.isPrime(num);
        assertEquals(expected, actual);
    }

    @Test
    public void isNameElina() {
        autoPractice practice = new autoPractice();
        String[] a = {"Luca", "Tom", "Elina"};
        assertEquals("Elina", practice.checkOutElina(a));
    }






/*Tests from practice on the lesson
    @Test
    public void is15GoodOne() {
        int num = 15;
        String expected = "Hello World.";
        String actual = autoPractice.method(num);
        assertEquals(expected, actual);
    }

    @Test
    public void isFiveGoodOne() {
        int num = 3;
        String expected = null;
        String actual = autoPractice.method(num);
        assertEquals(expected, actual);
    }

    @Test
    public void isFiveGoodOne() {
        int num = 10;
        String expected = null;
        String actual = autoPractice.method(num);
        assertEquals(expected, actual);
    }*/

}
