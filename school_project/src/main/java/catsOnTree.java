public class catsOnTree {

    public static String checkIfCatOnTree(String answer, String name) {
        switch (answer) {
            case "Yes":
                return answer + " , " + name + " saw cat on the tree.";
            case "No":
                return "After looking, " + name + " did not see any cats.";
            case "Maybe":
                return name + " is not telling the truth!";
            default:
                return name + ",please check again." + answer + "is not a valid answer:)";
        }
    }
}
