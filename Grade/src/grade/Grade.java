package grade;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
       Scanner InputGrade = new Scanner(System.in);
       System.out.print("Enter your Score : ");
       int AnsGrade = InputGrade.nextInt();
       if(AnsGrade >= 80){
           System.out.println("Score = "+AnsGrade+" : Your are Grade A");
       }
       else if(AnsGrade >74 && AnsGrade < 80){
           System.out.println("Score = "+AnsGrade+" : Your are Grade B+");
       }
       else if(AnsGrade >69 && AnsGrade < 75){
           System.out.println("Score = "+AnsGrade+" : Your are Grade B");
       }
       else if(AnsGrade >64 && AnsGrade < 70){
           System.out.println("Score = "+AnsGrade+" : Your are Grade C+");
       }
        else if(AnsGrade >59 && AnsGrade < 65){
           System.out.println("Score = "+AnsGrade+" : Your are Grade C");
       }
        else if(AnsGrade >54 && AnsGrade < 60){
           System.out.println("Score = "+AnsGrade+" : Your are Grade D+");
       }
        else if(AnsGrade >49 && AnsGrade < 55){
           System.out.println("Score = "+AnsGrade+" : Your are Grade D");
       }
        else{
            System.out.println("Score = "+AnsGrade+" : Your are Grade F");
        }
    }
    
}
