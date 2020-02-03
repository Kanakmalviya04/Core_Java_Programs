import java.util.Scanner;
abstract class base
{
public int a,b,c,d;
public void add()
{
System.out.println("Enter any 2 numbers for addition");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=a+b;
System.out.println("ADDITION is : "+c);
}}
class derived extends base
{
public void sub()
{
d=a-b;
System.out.println("SUBSTRACTION is : "+d);
}}
class abstrct1
{
public static void main(String arg[])
{
derived x=new derived();
x.add();
x.sub();
}
}