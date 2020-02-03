import java.util.Scanner;
class andopr
{
public static void main(String arg[])
{
int a,b;
boolean c;
System.out.println("Enter any two numbers");
Scanner a1=new Scanner(System.in);
a=a1.nextInt();
b=a1.nextInt();
c=((a>100)&&(b<500));
System.out.println("RESULT IS= "+c);
}
}