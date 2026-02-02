import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Restaurant McDonalds = new Restaurant(30, 3.5, 12, 0.2, "5am-11pm");
        Restaurant Chipotle = new Restaurant(30, 3.5, 15, 1.5, "6am-9pm");

        System.out.println("Chipotle");
        System.out.println(Chipotle.waitTime);
        System.out.println(Chipotle.rating);
        System.out.println(Chipotle.avgPrice);
        System.out.println(Chipotle.distance);
        System.out.println(Chipotle.hoursOpen);
        System.out.println("---");
        System.out.println("McDonalds");
        System.out.println(McDonalds.waitTime);
        System.out.println(McDonalds.rating);
        System.out.println(McDonalds.avgPrice);
        System.out.println(McDonalds.distance);
        System.out.println(McDonalds.hoursOpen);
    }
}
