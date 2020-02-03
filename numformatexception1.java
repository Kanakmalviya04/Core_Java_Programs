class numformatexception1
{
public static void main(String ar[])
{
int a,b,c;
try
{
a=Integer.parseInt(ar [0]);
b=Integer.parseInt(ar [1]);
try
{
c=a/b;
System.out.println("Division is : "+c);
}
catch(Exception g)
{
System.out.println(g.getMessage());
}}
catch(Exception g)
{
System.out.println(g.getMessage());
}
}
}