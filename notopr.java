import java.util.Scanner;
class notopr
{
public static void main(String arg[])
{
int x,y;
boolean z;
System.out.println("Enter any two values");
Scanner o1=new Scanner(System.in);
x=o1.nextInt();
y=o1.nextInt();
z=(x!=y);
System.out.println("RESULT IS= "+z);
}
}