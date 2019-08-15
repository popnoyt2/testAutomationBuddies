
public class autoPractice {

    public static int isNumberInRange(int start, int end, int number) {
        if (number > start & number < end) {
            return 0;
        } else if (number > end & number < start) {
            return 1;
        }
        return -1;
    }

    public static String checkWhoCanEatMore(String name, int numberOfHinkalis) {
        switch (numberOfHinkalis) {
            case 100:
                return name + " The great can eat: " + numberOfHinkalis;
            case 20:
                return "Can eat only " + numberOfHinkalis + " , " + name + " need to train more";
            default:
                return "Vegan";
        }
    }

    public static Boolean isPrime(int x) {
        if (x <= 0) {
            return null;
        }
        return x % 2 != 0;
    }

}
