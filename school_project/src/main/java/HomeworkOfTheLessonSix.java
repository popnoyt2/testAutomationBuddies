class HomeworkOfTheLessonSix {
    public static String movementAccordingNumbers(int direction) {

        switch (direction) {
            case 1:
                return ("move up");
            case 2:
                return ("move down");
            case 3:
                return ("move left");
            case 4:
                return ("move right");
            case 0:
                return ("do not move");
            default:
                return ("error!");
        }

    }
}