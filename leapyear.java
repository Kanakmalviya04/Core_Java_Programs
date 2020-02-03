import java.util.Scanner;
class leapyear
{
public static void main(String arg[])
{
int year;
System.out.println("Enter any year");
Scanner x=new Scanner(System.in);
year=x.nextInt();
if(year%4==0)
{
System.out.println("This year is a leap year");
}
else
{
System.out.println("This is not a leap year");
}
}
}