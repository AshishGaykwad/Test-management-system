package testProject;
import java.util.*;

public class myClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        
        
        while(true)
        {
            System.out.println("Enter 1 for add new questions:");
            
            System.out.println("Enter 2 for add user and take test and print the result:");
            
            System.out.println("Enter 3 for print result of all student:");
            
           
            choice = sc.nextInt();
            
            
            switch (choice) {
                case 1:
                {
                    Exam.addNewQuestion();
                    break;
            }
                case 2:
                {
                    Exam.addUserAndConductTest();
                    break;
                }
                case 3:
                {
                    Exam.printResultOfAllStudent();
                    break;
                }
                default:
                {
                    System.out.println("Enter valid choice");
                    break;
                }
            }
        }
    }
}
