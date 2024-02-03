import java.util.*;
class ScannerClass
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter name");
String name=sc.nextLine();

System.out.println("Enter gender");
String gender=sc.nextLine();

System.out.println("Enter age");
int age=sc.nextInt();

System.out.println("Enter mobileNo");
long mobileNo =sc.nextLong();

System.out.println("Enter cgpa");
double cgpa=sc.nextDouble();

 System.out.println("Name: " + name);
 System.out.println("Gender: " + gender);
 System.out.println("Age: " + age);
 System.out.println("Mobile Number: " + mobileNo);
 System.out.println("CGPA: " + cgpa);
}
}