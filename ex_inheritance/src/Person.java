public class Person {
    protected String name = "มูฮำหมัด";
    protected int age = 21;
    protected String workplace = "มหาวิทยาลัยเทคโนโลยีราชมงคลศรีวิชัย";
    public void walk(){
        System.out.println("ฉันกำลังเดิน");
    }
    public void eat(){
        System.out.println("ฉันกำลังกิน ");
    }
     public void stopCar(){
        System.out.println("เยียบเบรก  !! ");
    }
     public void startMotocycle(){
         System.out.println("เร่งเครื่องมอเตอร์ไซต์ ด้วยมือขวา");
     }
     public void trainHonk(){
         System.out.println("ปู๊น ๆ ๆ ๆ ๆ");
     }
     public void trainStop(){
         System.out.println("จอดตามสถานีี");
     }
}
class Programmer extends Person{
    protected String teamName = "Excellent";
    public void coding(){
        System.out.print("ฉันชอบเขียนโค๊ด  : ");
    }
    public static void main(String[]args){
        Person programmers = new Person();
        System.out.println(programmers.name+" "+programmers.age);
        programmers.walk();
        programmers.eat();
       programmers.stopCar();
    }
}
class Motocycle extends Person{
    private String modelMotocycle = "Wave-125";
    public static void main(String[]args){
        Motocycle myMotocycle = new Motocycle();
        System.out.println(myMotocycle.brandMotocycle+ " "+myMotocycle.modelMotocycle);
        myMotocycle.startMotocycle();
    }
}
class Train extends Person{
    protected  String modelTrain = "ดีเซล";
    public static void main(String[]args){
        Train myTrain = new Train();
        System.out.println(myTrain.typeTrain+" "+myTrain.modelTrain);
        myTrain.trainHonk();
        myTrain.trainStop();
    }
}
