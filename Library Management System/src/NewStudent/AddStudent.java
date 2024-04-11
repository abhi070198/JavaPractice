package NewStudent;

import java.util.*;

public class AddStudent 
{
	
	    public static void main(String[] args) 
	    {
	        AddStudent obj = new AddStudent();
	       
	        
	        Student[] info = obj.addStudens();
	        obj.displayInfo(info); // Call the method to display information
	    }

	    // Method to display information
	    public void displayInfo(Student[] info) 
	    {
	        for (Student user : info) 
	        {
	            System.out.println("User Information is : " + user.toString());
	        }
	    }

	    // Method to add students
	    public Student[] addStudens() 
	    {
	        Student[] userArr = new Student[1];

	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < userArr.length; i++) 
	        {
	            Student info = new Student();

	            System.out.println("Enter Rollno and Name");
	            int roll = sc.nextInt();
	            info.setRoll(roll);

//	            System.out.println("Enter User Name");
	            String name = sc.next();
	            info.setName(name);
//
//	            System.out.println("Enter User Rollno");
//	            int rno = sc.nextInt();
//	            info.

//	            System.out.println("Enter User MobileNumber");
//	            String mobNo = sc.next();
	           // info.setMob(mobNo);

	            userArr[i] = info;
	        }

	        System.out.println("Data saved Successfully");
	        return userArr;
	    }

}
