class base
{
public void show()
{
System.out.println("a==100 and b==50 :-");
int a=100,b=50;
System.out.println("In the Base class Addition is : "+(a+b));
}}
class derived1 extends base
{
public void show()
{
int a=100,b=50;
System.out.println("In the Derived 1 class Subtraction is : "+(a-b));
}}
class derived2 extends derived1
{
public void show()
{
int a=100,b=50;
System.out.println("In the Derived 2 class Multiplication is : "+(a*b));
}}
class derived3 extends derived2
{
public void show()
{
int a=100,b=50;
System.out.println("In the Derived 3 class Division is : "+(a/b));
}}
public class methodoverriding
{
public static void main(String arg[])
{
base b1=new base();
b1.show();
derived1 d1=new derived1();
d1.show();
derived2 d2=new derived2();
d2.show();
derived3 d3=new derived3();
d3.show();
}
}