import java.util.Scanner;
class throw2
{
public static void main(String ar[])
{
int p;
System.out.println("Enter any four digit PIN");
Scanner d=new Scanner(System.in);
p=d.nextInt();
if(p>9999)
{
throw new ArithmeticException("PIN is more than 4 digits");
}
else if(p<1000)
{
throw new ArithmeticException("PIN is less than 4 digits");
}
else
{
System.out.println("Validate PIN");
}
}
}