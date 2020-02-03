import java.util.Scanner;
abstract class base
{
public int a,b;
public int mul,div;
abstract public void multi();
}
class derived extends base
{
public void multi()
{
System.out.println("Enter any 2 numbers");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
mul=a*b;
System.out.println("Multiplication is : "+mul);
}
public void divi()
{
div=a/b;
System.out.println("Division is : "+div);
}}
class abstrctmethod
{
public static void main(String arg[])
{
derived d=new derived();
d.multi();
d.divi();
}
}