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
}
