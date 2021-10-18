package salary;
import java.util.Scanner;
public class Salary {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = 0;
        int con = 8,va=9;
        con++;
        va++;
        System.out.print(con+","+va);
        int time = input.nextInt();
        if (time <= 10) {
                System.out.println("You work time "+time+" hours");
                salary = time * 100;
                System.out.println("Get monney "+salary+" Bath");
            }
        else if(time > 10 && time <= 20){
                System.out.println("You work time "+time+" hours");
                time = time-10;
                salary = time * 200 + 1000;
                System.out.println("Get monney "+salary+" Bath");
        }
        else{
                System.out.println("You work time "+time+" hours");
                time = time-20;
                salary = time * 300 + 3000;
                System.out.println("Get monney "+salary+" Bath");
        }
    }
   
}

