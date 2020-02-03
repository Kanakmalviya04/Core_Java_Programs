class numformatexception2
{
public static void main(String arg[])
{
int a=20,b=10,c=10,x,y;
String s1=null;
String s2="KRITIKA";
try
{
x=a/(b-c);
System.out.println("X is : "+x);
}
catch(Exception d)
{
System.out.println(d.getMessage());
}
y=a/(b+c);
System.out.println("Y is : "+y);
try
{
System.out.println("Length of 1st String is "+s1.length());
}
catch(Exception d)
{
System.out.println(d.getMessage());
}
System.out.println("String 2nd is : "+s2);
System.out.println("Length of 2nd String is : "+s2.length());
}
}