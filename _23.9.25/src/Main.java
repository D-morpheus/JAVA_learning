import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Timer t = new Timer();
        t.to12Clock();
        System.out.println(t.toString());
        System.out.println(t.getHour());
        t.plusHours(4);
        System.out.println(t.toString());
        t.plusMinutes(234);
        System.out.println(t.toString());


    }
}