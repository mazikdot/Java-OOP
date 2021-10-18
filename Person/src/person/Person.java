package Person;
public class Person {
    protected String name = "มูฮำหมัด ปูตีล่า";
    protected int age = 21;
    protected String workplace = "มหาวิทยาลัยเทคโนโลยีราชมงคลศรีวิชัย";
    public void walk(){
        System.out.println("ฉันกำลังเดิน");
    }
    public void eat(){
        System.out.println("ไปกินข้าว");
    }
}
class Programmer extends Person{
    protected String teamName = "YELLO";
    public void coding(){
    System.out.println("ฉันกำลังเขียนโค๊ดโปรแกรม");
}
    public static void main(String[]args){
       Programmer programs = new Programmer();
       programs.walk();
       programs.eat();
       programs.coding();
       System.out.println("ชื่อ : "+programs.name+"\nอายุ : "+programs.age+"\nทำงานที่ : "+programs.workplace+"\nชื่อทีม : "
               +programs.teamName);
    }
}

class Dancer extends Person{
    protected String groupName= "ตั้งใจ";
    public void dancing(){
    System.out.println("ฉันกำลังเต้น");
}
    public static void main(String[]args){
       Dancer Dancers = new Dancer();
       Dancers.walk();
       Dancers.eat();
       Dancers.dancing();
       System.out.println("ชื่อ : "+Dancers.name+"\nอายุ : "+Dancers.age+"\nทำงานที่ : "+Dancers.workplace+"\nชื่อกลุ่ม : "
               +Dancers.groupName);
    }
}

class Singer extends Person{
    protected String bandName= "Bodyslam";
    public void singing(){
    System.out.println("ร้องเพลง");
    }
    public void playGitar(){
    System.out.println("และเล่นกีต้า");
    }
    public static void main(String[]args){
       Singer Singers = new Singer();
       Singers.walk();
       Singers.eat();
       Singers.singing();
       Singers.playGitar();
       System.out.println("ชื่อ : "+Singers.name+"\nอายุ : "+Singers.age+"\nทำงานที่ : "+Singers.workplace+"\nชื่อวงดนตรี : "
               +Singers.bandName);
    }
}
