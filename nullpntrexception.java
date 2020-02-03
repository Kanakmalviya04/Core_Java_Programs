public class nullpntrexception
{
public static void main(String ar[])
{
String s1=null;
String s2="JAVA PROGRAM";
try
{
System.out.println("Length of 1st String is : "+s1.length());
}
catch(Exception d)
{
System.out.println(d.getMessage());
}
System.out.println("String s2 is : "+s2);
System.out.println("Length of 2nd String is : "+s2.length());
}
}