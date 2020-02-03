import java.util.Scanner;
class throw1
{
public static void main(String arg[])
{
int m;
System.out.println("Enter mark which is you obtain");
Scanner s=new Scanner(System.in);
m=s.nextInt();
if(m>100)
{
throw new ArithmeticException("Mark is out of Range");
}
else if(m<0)
{
throw new ArithmeticException("Mark is below the Range");
}
else
{
System.out.println("Valide mark");
}
}
}