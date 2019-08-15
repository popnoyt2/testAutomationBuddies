public class checkIfCatOnTree {

    public static String checkIfCatOnTree(String answer, String name) {
        switch (answer) {
            case "Yes":
                return name + "saw cat on the tree.";
            case "No":
                return "After looking " + name + "did not see no cats";
            case "Maybe":
                return name + "is not telling the truth";
            default:
                return name + ",please check again.";
        }
    }
}
