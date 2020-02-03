import java.util.Scanner;
class result
{
public static void main(String arg[])
{
int h,e,p,c,m,total;
float percnt;
System.out.println("Enter the marks of 5 subjects");
Scanner x=new Scanner(System.in);
h=x.nextInt();
e=x.nextInt();
p=x.nextInt();
c=x.nextInt();
m=x.nextInt();
total=h+e+p+c+m;
System.out.println("Your Grand Total Mraks is = "+total);
percnt=total/5;
if(percnt<33)
{
System.out.println("Your Percent is = "+percnt);
System.out.println("You Are FAIL ");
}
else if(percnt<40)
{
System.out.println("Your Percent is = "+percnt);
System.out.println("Your Got Grade 'D'");
}
else if(percnt<65)
{
System.out.println("Your Percent is = "+percnt);
System.out.println("Your Got Grade 'C'");
}
else if(percnt<75)
{
System.out.println("Your Percent is = "+percnt);
System.out.println("Your Got Grade 'B'");
}
else if(percnt>=75)
{
System.out.println("Your Percent is = "+percnt);
System.out.println("Your Got Grade 'A'");
}
}
}