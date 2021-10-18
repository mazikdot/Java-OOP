import java.util.*;
abstract class FoodOrder {
    String InputCustomerName;
    int price;
    public abstract void greeting();
}

class Burger extends FoodOrder {

    public Burger(String n , int priceBurger) {    //สร้าง constructor คือ เมธอดที่ชื่อเดียวกับ Class
        InputCustomerName = n;
        price = priceBurger;
    }
    @Override
    public void greeting() {
        System.out.println("สั่งเบอร์เกอร์ ");
        System.out.println("ชื่อผู้สั่งเบอร์เกอร์ : " + InputCustomerName);
        System.out.println("ราคา : "+ price + " บาท");
        System.out.println("--------------------------------------------------------------");
    }
}

class Pizza extends FoodOrder {
    public Pizza(String n, int pricePizza) {  //สร้าง constructor คือ เมธอดที่ชื่อเดียวกับ Class
        InputCustomerName = n;
        price = pricePizza;
    }
    @Override
    public void greeting() {
        System.out.println("สั่งพิซซ่า ");
        System.out.println("ชื่อผู้สั่งพิซซ่า : " + InputCustomerName + "\n"+"ราคา : "+price+" บาท");
        System.out.println("--------------------------------------------------------------");
    }
}

class Sandwich extends FoodOrder {

    public Sandwich(String n,int priceSandwich) {  //สร้าง constructor คือ เมธอดที่ชื่อเดียวกับ Class
        InputCustomerName = n;
        price = priceSandwich;
    }
    @Override
    public void greeting() {
        System.out.println("สั่งแซนวิซ :  ");
        System.out.println("ชื่อผู้สั่งแซนวิซ : " + InputCustomerName + "\n"+"ราคา : "+price+" บาท");
        System.out.println("--------------------------------------------------------------");
    }
}

public class Food {

    public static void main(String[] args) {
        String CustomerName;
        Scanner input = new Scanner(System.in);
        System.out.print("กรุณาระบุชื่อผู้สั่งอาหาร : ");
        CustomerName = input.next();

        Burger yr = new Burger(CustomerName,30);
        yr.greeting();

        Pizza bd = new Pizza(CustomerName, 150);
        bd.greeting();

        Sandwich val = new Sandwich(CustomerName,40);
        val.greeting();

    }
}