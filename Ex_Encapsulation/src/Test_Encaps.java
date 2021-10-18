class EncapsDemo{
    private int empId;
    private String empName;
    private int empAge;
    //ถ้าต้องการเข้าถึง attribute ที่กำหนดเป็น private ให้เราใช้ method 
    //getter ใช้สำหรับการอ่านหรือดึงค่า 
    //setter อัพเดตค่าหรือเปลี่ยนแปลงค่าตัวแปร
    public int get_empId(){
        return empId;
    }
    public String get_empName(){
        return empName;
    }
    public int get_empAge(){
        return empAge;
    }
    public void set_empId(int new_id){
        empId = new_id;
        
    }
    public void set_empName(String new_name){
        empName = new_name;
    }
    public void set_empAge(int new_age){
        empAge = new_age;
    }
}
public class Test_Encaps {
    public static void main(String args[]){
        EncapsDemo obj = new EncapsDemo();
        obj.set_empId(1782);
        obj.set_empName("Muhammad");
        obj.set_empAge(42);
        System.out.println("รหัสลูกจ้าง : "+obj.get_empId());
        System.out.println("ชื่อลูกจ้าง : "+obj.get_empName());
        System.out.println("อายุลูกจ้าง : "+obj.get_empAge());
    }
}
