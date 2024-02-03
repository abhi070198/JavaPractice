class ArithmeticOperations
{
public static void main(String[] args)
{
addition();
subtraction();
multiplication();
division();
}
public static void addition()
{
int a=10;
int b=20;
int res = a+b;
System.out.println("addition of two numbers is "+res);
}
public static void subtraction()
{
int a=10;
int b=20;
int res = a-b;
System.out.println("subtraction of two numbers is "+res);
}
public static void multiplication()
{
int a=10;
int b=20;
int res = a*b;
System.out.println("multiplication of two numbers is "+res);
}
public static void division()
{
int a=10;
int b=20;
int res = a%b;
System.out.println("division of two numbers is "+res);
}
}