package dynamic;
class Animal{  
   String name; 
   int  no_of_legs;  
   int age; 
   public Animal(String name,int no_of_legs,int age){ 
       this.name = name;  
       this.no_of_legs = no_of_legs;  
       this.age = age; 
   }
   public void Sound(){
       System.out.println("สัตว์ชื่อ : "+name); 
       System.out.println("จำนวนขา : "+no_of_legs);
       System.out.println("อายุ : "+age);
   }
}
class Dog extends Animal{
    String dog_breed;   
    public Dog(String name, int no_of_legs,int age,String dog_breed){
        super(name,no_of_legs,age);
        this.dog_breed =  dog_breed;
    }
    @Override
    public void Sound(){
        super.Sound();
        System.out.println("สุนัขพันธ์  : "+dog_breed);
        System.out.println("Bow Bow");
    }
}
class Cat extends Animal{
    String cat_breed;
    public Cat(String name , int no_of_legs , int age, String cat_breed){
        super(name,no_of_legs,age);
        this.cat_breed = cat_breed;
    }
     @Override
    public void Sound(){
        super.Sound();
        System.out.println("แมวพันธ์ : "+cat_breed);
        System.out.println("Meow Meow");
    }
}
class Duck extends Animal{
    String duck_breed;
    public Duck(String name , int no_of_legs , int age, String duck_breed){
        super(name,no_of_legs,age);
        this.duck_breed = duck_breed;
    }
     @Override
    public void Sound(){
        super.Sound();
        System.out.println("เป็ดพันธ์ : "+duck_breed);
        System.out.println("quack quack");
    }
}
public class Dynamic_test {
     public static void main(String[] args){
        Animal Dog,Cat,Duck;
        Dog = new Dog("ส้ม",4,2,"พุดเดิ้ล");
        Cat = new Cat("แดง ",4,4,"เปอร์เซีย");
        Duck = new Duck("เหลือง ",2,1,"บาบารี");
            System.out.println("----------------------------------------------------------------------");
       Dog.Sound();
            System.out.println("----------------------------------------------------------------------");
        Cat.Sound();
          System.out.println("----------------------------------------------------------------------");
        Duck.Sound();
    }
}
