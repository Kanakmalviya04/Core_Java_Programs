class ctor
{
public int a,b;
ctor(int a1,int b1)
{
a=a1;
b=b1;
}
public void show()
{
System.out.println("Multiplication is : "+(a*b));
}}
class parameterisedcons
{
public static void main(String arg[])
{
ctor d1=new ctor(50,10);
d1.show();
}
}