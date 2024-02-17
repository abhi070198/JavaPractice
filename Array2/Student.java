package Array2;

public class Student 
{
	int rollno;
	String name;
	
	void setRno(int rno)
	{
		if(rollno>0)
		{
			rollno=rno;
		}
		else
		{
			System.out.println("roll no value is incorrect");
			rollno=0;
		}
	}
	void setName(String nm)
	{
		name=nm;
	}
	int getRno()
	{
		return rollno;
	}
	String getName()
	{
		return name;
	}
}
