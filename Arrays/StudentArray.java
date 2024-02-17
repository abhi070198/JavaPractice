package Arrays;

public class StudentArray 
{

	public static void main(String[] args) 
	{
		Student obj1=new Student();
		obj1.name="abhi";
		obj1.rollno=10;
		
		Student obj2=new Student();
		obj2.name="amit";
		obj2.rollno=11;
		
		Student obj3=new Student();
		obj3.name="shivam";
		obj3.rollno=12;
		
		Student[] stuArray=new Student[3];
		stuArray[0]=obj1;
		stuArray[1]=obj2;
		stuArray[2]=obj3;
		
		StudentArray obj=new StudentArray();
		obj.getStudent(stuArray); 
		
		
		
	}

	 void getStudent(Student[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			Student sObj=arr[i];
			System.out.println("Roll no. is "+sObj.rollno);
			System.out.println("name is "+sObj.name);
		}
		
	}

}
