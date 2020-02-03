import java.util.Scanner;
class method1
{
public static void main(String arg[])
{
calc();               //calling of function(method)
}
static void calc()             //Declaration & Definition
{
int a,b,c;
System.out.println("Enter values of a and b");
Scanner x= new Scanner(System.in);
a=x.nextInt();
b=x.nextInt();
c=a+b;
System.out.println("Addition is :"+c);
}
}
