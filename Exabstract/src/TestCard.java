import java.util.*;

abstract class Card {

    String name;

    public abstract void greeting();
}

class Year extends Card {

    public Year(String n) {    //สร้าง constructor คือ เมธอดที่ชื่อเดียวกับ Class
        name = n;
    }

    @Override
    public void greeting() {
        System.out.println("Dear.." + name + "\n");
        System.out.println("สวัสดีปีใหม่ \n\n");
    }
}

class Birthday extends Card {

    int age;

    public Birthday(String n, int years) {  //สร้าง constructor คือ เมธอดที่ชื่อเดียวกับ Class
        name = n;
        age = years;
    }

    @Override
    public void greeting() {
        System.out.println("Dear..." + name + "\n");
        System.out.println("สุขสันวันเกิดนะปีที่ " + age + "\n\n");
    }
}

class Valentine extends Card {

    public Valentine(String n) {  //สร้าง constructor คือ เมธอดที่ชื่อเดียวกับ Class
        name = n;
    }

    @Override
    public void greeting() {
        System.out.println("Dear..." + name + "\n");
        System.out.println("สุชสันต์วันวาเลนไทน์\n\n");
    }
}

public class TestCard {

    public static void main(String[] args) {
        String me;
        Scanner input = new Scanner(System.in);
        System.out.print("กรุณาระบุชื่อผู้รับ : ");
        me = input.next();

        Year yr = new Year(me);
        yr.greeting();

        Birthday bd = new Birthday(me, 21);
        bd.greeting();

        Valentine val = new Valentine(me);
        val.greeting();

    }
}