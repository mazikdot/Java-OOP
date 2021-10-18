
package pkgstatic;
class Static_poly{
    public int calculate(int distance1 , int distance2,int distance3,int distance4){
        return distance1+distance2+distance3+distance4;
    }
      public float calculate(float wide, float longs){
       float total;
       total = wide*longs;
       return total;
    }
      public double calculate(double radius){
          double circle = 4*3.14*(radius*radius);
          return circle;
      }
      public double calculate(int  x , double y,double z){
          return (x+ y)*z;
      }
}
public class Static_test {
    public static void main(String[] args){
        Static_poly demo =  new Static_poly();
        System.out.print("ระยะทางรวม = ");
        System.out.println(demo.calculate(2, 3,5,5));
        System.out.print("กว้างคูณยาว  = ");
        System.out.println(demo.calculate(2.5f,2.6f));
        System.out.print("หาพื้นที่ผิวของทรงกลม  = ");
        System.out.println(demo.calculate(2.5));
        System.out.print("(Int + Double)  * Double : Return Double  = ");
        System.out.println(demo.calculate(5,2.5,3));
    }
}
