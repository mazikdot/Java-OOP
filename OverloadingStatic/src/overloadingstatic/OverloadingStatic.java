
package overloadingstatic;
//Polymophishm Static or Overloading
class Calculartor{
    int multiplication( int operand1,int operand2){
        return operand1 * operand2;
}
    int multiplication(int operand1, int operand2,int operand3){
        return operand1 * operand2 * operand3;
    }
}
public class OverloadingStatic {
    public static void main(String[] args) {
       Calculartor cal = new Calculartor();
       System.out.println("Multiplication of two operand "+cal.multiplication(2,6));
       System.out.println("Multiplication of two operand "+cal.multiplication(2,6,9));
    }
    
}
