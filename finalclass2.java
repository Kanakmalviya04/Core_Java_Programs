import java.util.Scanner;
final class base1
{
public void calc()
{
int a,b,c;
System.out.println("Enter 2 numbers for ADDITION");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=a+b;
System.out.println("ADDITION is : "+c);
}}
final class base2
{
public void calc()
{
int a,b,c;
System.out.println("Enter 2 numbers for MULTIPLICATION");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=a*b;
System.out.println("MULTIPLICATION is : "+c);
}}
public class finalclass2
{
public static void main(String arg[])
{
base1 k=new base1();
k.calc();
base2 d=new base2();
d.calc();
}
}