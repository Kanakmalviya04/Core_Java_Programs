final class base
{
public void show()
{
System.out.println("Hello final class");
}}
class derived extends base
{
public void show()
{
System.out.println("Hello class final ");
}}
public class finalclass
{
public static void main(String arp[])
{
base b=new base();
b.show();
derived d=new derived();
d.show();
}
}