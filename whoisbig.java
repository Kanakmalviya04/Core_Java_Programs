import java.util.Scanner;
class whoisbig
{
public static void main(String arg[])
{
int a,b,c;
System.out.println("Enter the values");
Scanner x1=new Scanner(System.in);
a=x1.nextInt();
b=x1.nextInt();
c=x1.nextInt();
if(a>b)
{
System.out.println("a is BIG");
}
else if(b>c)
{
System.out.println("B is BIG");
}
else 
{
System.out.println("c is BIG");
}
}
}