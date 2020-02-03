abstract class base
{
public int x=50,y=2;
public void multi()
{
System.out.println("The multiplication is : "+(x*y));
}}
class derived extends base
{
public void div()
{
System.out.println("The division is : "+(x/y));
}}
class abstrct
{
public static void main(String ar[])
{
derived d1=new derived();
d1.multi();
d1.div();
}
}