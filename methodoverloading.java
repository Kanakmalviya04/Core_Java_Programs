public class methodoverloading
{
static void area(int a)
{
System.out.println("Area of Square is : "+(a*a));
}
static void area(double r)
{
System.out.println("Area of Circle is : "+(3.14*r*r));
}
static void area(double b, double h)
{
System.out.println("Area of Triangle is : "+(0.5*b*h));
}
public static void main(String ar[])
{
int a1=2;
double r1=4;
double b1=2,h1=6;
area(a1);
area(r1);
area(b1,h1);
}
}