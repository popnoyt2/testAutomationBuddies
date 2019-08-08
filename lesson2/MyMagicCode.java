import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class MyMagicCode {

    public static void main(String[] args) {

        System.out.println("Your name is: "+args[0]+" "+"and Your Surname is: "+args[1]);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

}