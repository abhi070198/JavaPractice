import java.util.*;
class ScannerEx
{
public static void main(String[] args)
{

int a,b,res;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();

System.out.println("addition of two numbers");
res=a+b;
System.out.println(res);

float x,y,result;
x=sc.nextFloat();
y=sc.nextFloat();

System.out.println("subtraction of two numbers");
result=x-y;
System.out.println(result);

System.out.println("product of two  numbers");
res=a*b;
System.out.println(res);

System.out.println("division of two numbers");
res=a/b;
System.out.println(res);
}
}