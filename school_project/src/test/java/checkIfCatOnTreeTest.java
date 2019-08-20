import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class checkIfCatOnTreeTest {

    @Test
    public void checkIfCatIsOnTreeTest() {
        String name = "Luka";
        String answer = "Yes";
        String expected = answer + " , " + name + " saw cat on the tree.";

        assertEquals(expected, catsOnTree.checkIfCatOnTree(answer, name));
    }

    @Test
    public void checkIfNoCatsOnTreeTest() {
        String name = "Tom";
        String answer = "No";
        String expected = "After looking, " + name + " did not see any cats.";

        assertEquals(expected, catsOnTree.checkIfCatOnTree(answer, name));
    }

    @Test
    public void checkIfCatsMaybeAreOnTreeTest() {
        String name = "Luka";
        String answer = "Maybe";
        String expected = name + " is not telling the truth!";

        assertEquals(expected, catsOnTree.checkIfCatOnTree(answer, name));
    }

    @Test
    public void checkIfCatsOnTreeTest() {
        String name = "Tommas";
        String answer = "Yeess";
        String expected = name + ",please check again." + answer + "is not a valid answer:)";

        assertEquals(expected, catsOnTree.checkIfCatOnTree(answer, name));
    }

    int number = 15;
    static autoPractice autoPractice;

    /*@BeforeAll
    public void init() {
        System.out.println("Checkin can be divided");
        autoPractice = new autoPractice();
    }*/

    @Test
    public void divideByFile() {
        assertEquals(true, autoPractice.canDivide(number));
    }

    @AfterAll
    public void init2() {
        System.out.println("Test finish");
        autoPractice = null;
    }
}
