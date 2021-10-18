
abstract class Shape{
    abstract  void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("วาดรูปสี่เหลี่ยม Rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("วาดรูปวงกลม Circle");
    }
}
public class Test_Abstract {
    public static void main(String args[]){
        Shape s = new Rectangle();
        Shape c = new Circle();
        s.draw();
        c.draw();
    }
}
