package testProject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Exam {
    
    static ArrayList<Question> myList = new ArrayList<>();
    static ArrayList<User> myList2 = new ArrayList<>();
    
    public static void addNewQuestion()
    {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter question text for quesion"+" "+i);
            String questionText = sc.nextLine();

            System.out.println("Enter option 1 for that quesion :");
            String option1 = sc.nextLine();

            System.out.println("Enter option 2 for that question :");
            String option2 = sc.nextLine();

            System.out.println("Enter option 3 for that question :");
            String option3 = sc.nextLine();

            System.out.println("Enter option 4 for that question :");
            String option4 = sc.nextLine();

            System.out.println("Enter your choice for that question only digit");
            int correctChoice = sc.nextInt();
            sc.nextLine(); 

            
            

        
        myList.add(new Question (questionText, option1, option2, option3, option4, correctChoice));
    }
        System.out.println("Questions added...");
        //System.out.println(myList);
        
        
        
    }
    public static void addUserAndConductTest()
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= sc.nextLine();
        myList2.add(new User(name,User.result));
        System.out.println(myList2);
        
        Collections.shuffle(myList);
        
        int cnt=0;
        for (int i = 1; i <=2; i++) {
    	   System.out.println(myList.get(i));
    	   System.out.println("Enter the Choice :-  ");
    	   int choice=sc.nextInt();
    	   
    	   
    	   if(choice==myList.get(i).correctChoice)
    	   {
    			   cnt++;
    	   }
		
	}
       if(cnt >= 1)
       {
    	  User. result="Pass";
    	   System.out.println("Congratulations");
       }
       else
       {
    	   User.result="Fail";
    	   System.out.println("Better luck next time");
       }
        
        
    }
    
    public static void printResultOfAllStudent()
    {
    	int cnt=0;
    	
		for (User users : myList2) {
			System.out.println(User.name+", Result : "+User.result);
			if(User.result.equals("Pass"))
			{
				cnt++;
			}
			
		}
		System.out.println("Total Users : "+myList2.size());
		System.out.println("Pass Students : "+cnt);
		System.out.println("Result : "+(cnt*100/myList2.size()));
		
	}
    }


