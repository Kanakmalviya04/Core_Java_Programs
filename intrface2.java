interface value
{
public int a=100,b=150;
}
interface method extends value
{
public void calc();
}
class show implements method
{
public void calc()
{
System.out.println("ADDITION IS : "+(a+b));
}}
class intrface2
{
public static void main(String ar[])
{
show x1=new show();
x1.calc();
}
}