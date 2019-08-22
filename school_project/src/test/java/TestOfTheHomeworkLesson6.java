import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOfTheHomeworkLesson6 {

    static HomeworkOfTheLessonSix lessonSix;

    @BeforeAll
    static void init() {
        System.out.println("Start tests");
        lessonSix = new HomeworkOfTheLessonSix();
    }

    @Test
    @DisplayName("Checking movement up")
    public void checkMovementUp() {
        assertEquals("move up", lessonSix.movementAccordingNumbers(1));
    }

    @Test
    @DisplayName("Checking movement down")
    public void checkMovementDown() {
        assertEquals("move down", lessonSix.movementAccordingNumbers(2));
    }

    @Test
    @DisplayName("Checking movement left")
    public void checkMovementLeft() {
        assertEquals("move left", lessonSix.movementAccordingNumbers(3));
    }

    @Test
    @DisplayName("Checking movement right")
    public void checkMovementRight() {
        assertEquals("move right", lessonSix.movementAccordingNumbers(4));
    }

    @Test
    @DisplayName("Checking tht there is no movement")
    public void checkNoMovement() {
        assertEquals("do not move", lessonSix.movementAccordingNumbers(0));
    }

    @Test
    @DisplayName("Checking Error 1")
    public void checkMovementError() {
        assertEquals("error!", lessonSix.movementAccordingNumbers(7));
    }

    @Test
    @DisplayName("Checking Error 2")
    public void checkNegativeMovementError() {
        assertEquals("error!", lessonSix.movementAccordingNumbers(-3));
    }

    @AfterAll
    static void init2() {
        System.out.println("Tests finish");
        lessonSix = null;
    }
}
