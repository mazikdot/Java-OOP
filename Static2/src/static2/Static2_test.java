
package static2;
class Human {
    String name; //ประกาศตัวแปร name ชนิดเป็น String
    String province;  //ประกาศตัวแปร province ชนิดเป็น String
    int age,age2; //ประกาศตัวแปร age ชนิดเป็น Integer
    String workStudy; 
    String Studyz;
    String x;
    String y;
    String test3,test2;
    String total;
   public Human(String name,String province,int age){ //สร้าง method Human 
       this.name = name;  
       this.province = province;  
       this.age = age; 
       System.out.println("ชื่อ "+name); 
       System.out.println("จังหวัดที่เกิด : "+province);
       System.out.println("อายุ : "+age);
       System.out.println("----------------------------------------------------------------------");
   }
      public Human(String name,String province,int age,String workStudy){ //สร้าง method Human 
       this.name = name;  
       this.province = province;  
       this.age = age; 
       this.workStudy = workStudy; 
       System.out.println("ชื่อ "+name); 
       System.out.println("จังหวัดที่เกิด : "+province);
       System.out.println("อายุ : "+age);
       System.out.println("สอนคณะ : "+workStudy);
       System.out.println("----------------------------------------------------------------------");
   }
       public Human (String x , String y,String Studyz,int age2 ){ //สร้าง method Human 
       this.x = x;  
       this.y = y;  
       this.age2 = age2; 
       this.Studyz = Studyz; 
       System.out.println("ชื่อ "+x); 
       System.out.println("จังหวัดที่เกิด : "+y);
       System.out.println("อายุ : "+age2);
       System.out.println("เรียนคณะ : "+Studyz);
       System.out.println("----------------------------------------------------------------------");
   }
//       public int  test (int age1,int age2){
//           System.out.print("อายุคูณกัน : ");
//           return age1*age2;
//       }
//       public String test (String test3,String test2){
//           total = "\nชื่อ "+test3+" นามสกุล " +test2;
//           return total;
//       }
     
}
public class Static2_test {
    public static void main(String[] args){
        Human Per1,Per2,Per3;
        Per1 = new Human("สมพง","กรุงเทพ",25);      
        Per2 = new Human("สมพง","กรุงเทพ",25,"วิศวกรรมศาสตร์");
        Per3 = new Human("สมพง","กรุงเทพ","วิศวกรรมศาสตร์",23);
//        Human demo = new Human();
//        System.out.print(demo.test(2, 3));
//        System.out.print(demo.test("มูฮำหมัด", "ปูตีล่า"));
    }
}
