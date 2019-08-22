import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirthdayTest {

    @Test
    public void isMyBirthday() {
        Birthday birthday = new Birthday();
        int day = 27;
        int month = 9;
        assertEquals("Yes,Your B-day is on " + day + "." + month, birthday.isItMyBirthday(month, day));
    }

    @Test
    public void isNotMyBirthday() {
        Birthday birthday = new Birthday();
        int day = 27;
        int month = 10;
        assertEquals("No, its not your B-day", birthday.isItMyBirthday(month, day));
    }

    @Test
    public void isKindOfMyBirthday() {
        Birthday birthday = new Birthday();
        int day = 10;
        int month = 9;
        assertEquals("No, its not your B-day", birthday.isItMyBirthday(month, day));
    }

    @Test
    public void isDefNotMyBirthday() {
        Birthday birthday = new Birthday();
        int day = 15;
        int month = 7;
        assertEquals("No, its not your B-day", birthday.isItMyBirthday(month, day));
    }

    @Test
    public void isNotValidBirthDay() {
        Birthday birthday = new Birthday();
        int day = 50;
        int month = 12;
        assertEquals("It is not Valid B-Day!", birthday.isItMyBirthday(month, day));
    }

    @Test
    public void isNotValidBirthMonth() {
        Birthday birthday = new Birthday();
        int day = 15;
        int month = 30;
        assertEquals("It is not Valid B-Day!", birthday.isItMyBirthday(month, day));
    }

    @Test
    public void checkIfIsNegativeBirthday() {
        Birthday birthday = new Birthday();
        int day = -15;
        int month = 30;
        assertEquals("It is not Valid B-Day!", birthday.isItMyBirthday(month, day));
    }

    @Test
    public void checkIfIsNullBirthday() {
        Birthday birthday = new Birthday();
        int day = 0;
        int month = 30;
        assertEquals("It is not Valid B-Day!", birthday.isItMyBirthday(month, day));
    }
}
