public class arthmtcexception
{
public static void main(String ar[])
{
int a=20,b=10,c=10,x,y;
try
{
x=a/(b-c);
System.out.println("Value of X is : "+x);
}
catch(Exception s)
{
System.out.println(s.getMessage());
}
finally
{
System.out.println("Plz Don't divide any number to Zero");
}
y=a/(b+c);
System.out.println("Value of Y is : "+y);
}
}