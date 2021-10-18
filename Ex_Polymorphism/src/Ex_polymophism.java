/*คลาสแม่ */
class Human{  //สร้างคลาส Human
   String name; //ประกาศตัวแปร name ชนิดเป็น String
   String province;  //ประกาศตัวแปร province ชนิดเป็น String
   int age; //ประกาศตัวแปร age ชนิดเป็น Integer
   public Human(String name,String province,int age){ //สร้าง method Human 
       //พร้อมทั้งรับค่า name province age ผ่าน method
       //นำค่าที่รับเข้ามา เก็บเอาไว้ในตัวแปรที่ประกาศไว้ 
       //this ก็คือ อ้างถึงตัวแปรที่ประกาศเอาไว้ในคลาส
       this.name = name;  
       //นำ province ที่รับเข้ามาเก็บไว้ในตัวแปรที่ประกาศไว้ในคลาส
       this.province = province;  
        //นำ age ที่รับเข้ามาเก็บไว้ในตัวแปรที่ประกาศไว้ในคลาส
       this.age = age; 
   }
   //สร้าง method ขึ้นมาใหม่ชื่อว่า Introduce
   public void Introduce(){
   //แสดงผลลัพธ์พร้อมทั้งขึ้นบรรทัดใหม่เอาตัวแปร name มาแสดง
       System.out.println("ชื่อ "+name); 
   //แสดงผลลัพธ์พร้อมทั้งขึ้นบรรทัดใหม่เอาตัวแปร province มาแสดง
       System.out.println("จังหวัดที่เกิด : "+province);
   //แสดงผลลัพธ์พร้อมทั้งขึ้นบรรทัดใหม่เอาตัวแปร age มาแสดง
       System.out.println("อายุ : "+age);
   }
}
//สร้างคลาส Teacher พร้อมทั้งสืบทอดคุณสมบัติมาจากคลาส Human
class Teacher extends Human{
    String workStudy;   //สร้าง attribute workStudy แผนก
    //สร้าง method ชื่อ Teacher รับค่า name province age และ workStudy
    public Teacher(String name, String province,int age,String workStudy){
        //สืบทอด attribute จากคลาส Human คือดึงเอาตัวแปรจากคลาสนั้นมาใช้
        super(name,province,age);
        //รับค่า workStudy เข้ามา และเก็บเอาไว้ในตัวแปร workStudy
        this.workStudy =  workStudy;
    }
    //Override คือการเขียนทับของเดิมที่มีอยู่แล้ว
    @Override
    //สร้าง method ชื่อ Introduce 
    public void Introduce(){
        //สืบทอด method Introduce มาจากคลาสแม่ ที่ใช้สำหรับปริ้นค่า
        super.Introduce();
        //แสดงผลลัพธ์คณะ และดึงค่าจากตัวแปร workStudy มาใช้
        System.out.println("สอนคณะ  : "+workStudy);
    }
}
//สร้างคลาส Student พร้อมทั้งสืบทอดคุณสมบัติมาจากคลาส Human
class Student extends Human{
    //ประกาศตัวแปรใหม่ ชื่อ Study ชนิดเป็น String
    String Study;
    //สร้าง method ชื่อ Student รับค่า name province age และ Study
    public Student(String name , String province , int age, String Study){
        //อินสแตนซ์ตัวแปรมาใช้งานจากคลาสแม่
        super(name,province,age);
        //Study ที่รับเข้ามาเก็บเอาไว้ในตัวแปร ที่ได้ประกาศในคลาส
        this.Study = Study;
    }
    //การ Override คือการเขียนทับคุณสมบัติเดิม
     @Override
    //สร่่าง Method Introduce
    public void Introduce(){
        //สืบทอดคุณสมบัติ method Introduce จากคลาสแม่
        super.Introduce();
        //แสดงผลลัพธ์ เรียนคณะ : + กับค่าที่เราเข้ามา คือ Study
        System.out.println("เรียนคณะ : "+Study);
    }
}
//สร้างคลาส Ex_polymophism 
public class Ex_polymophism {
    //สร้าง method 
    public static void main(String[] args){
        //คลาสแม่ มีการประกาศตัวแปร 3 ตัว คือ Per1,Per2,Per3
        Human Per1,Per2,Per3;
        //ตัวแปร Per1 อินสแตนซ์ คลาส Human พร้อมทั้งส่งค่าไปให้กับตัวแปรที่สร้างไว้
        Per1 = new Human("สมพง","กรุงเทพ",25);
        //ตัวแปร Per2 อินสแตนซ์ คลาส Teacher พร้อมทั้งส่งค่าไปให้กับตัวแปรที่สร้างไว้
        Per2 = new Teacher("เกสรา","สงขลา",40,"วิศวกรรมศาสตร์");
        //ตัวแปร Per3 อินสแตนซ์ คลาส Student พร้อมทั้งส่งค่าไปให้กับตัวแปรที่สร้างไว้
        Per3 = new Student("นายมูฮำหมัด ปูตีล่า","สงขลา",21,"วิศวกรรมศาสตร์");
        //เรียกใช้ Polymophism method Introduce ทั้ง 3 method คือ method สำหรับ
        //แสดงผลลัพธ์
        Per1.Introduce();
        Per2.Introduce();
        Per3.Introduce();
    }
}
