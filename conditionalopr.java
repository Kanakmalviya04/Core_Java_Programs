import java.util.Scanner;
class conditionalopr
{
public static void main(String arg[])
{
int a,b,c;
System.out.println("Enter any two numbers");
Scanner a1=new Scanner(System.in);
a=a1.nextInt();
b=a1.nextInt();
c=((a>b)?a:b);
System.out.println("RESULT IS= "+c);
}
}