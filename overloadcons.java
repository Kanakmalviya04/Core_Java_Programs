class area
{
public int l,w,ra;
public double r,ca,b,h,ta;
area()
{
l=20;
w=5;
ra=l*w;
System.out.println("The AREA of rectangle is : "+ra);
}
area(double r1)
{
r=r1;
ca=3.1416*r*r;
System.out.println("The AREA of circle is : "+ca);
}
area(double b1,double h1)
{
b=b1;
h=h1;
ta=0.5*h*b;
System.out.println("The AREA of triangle is : "+ta);
}}
class overloadcons
{
public static void main(String arg[])
{
area a1=new area();
area a2=new area(7);
area a3=new area(2,44);
}
}