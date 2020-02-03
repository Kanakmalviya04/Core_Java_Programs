class area
{
public int p,r,t,si;
public double r1,h,ac;
area()
{
p=500;
r=5;
t=2;
si=p*r*t/100;
System.out.println("The SIMPLE INTREST is : "+si);
}
area(double r2,double h1)
{
r1=r2;
h=h1;
ac=3.1416*r1*r1*h;
System.out.println("The AREA of Cylinder is : "+ac);
}}
class overloadcons1
{
public static void main(String arg[]) 
{
area a1=new area();
area a2=new area(2,7);
}
}