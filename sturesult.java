import java.util.Scanner;
class grade
{
public String name;
public int i1,i2,i3,i4,i5,total,percent;
public void getdata()
{
System.out.println("Enter name of student");
Scanner x=new Scanner (System.in);
name=x.next();
System.out.println("Enter the marks of 5 subjects");
i1=x.nextInt();
i2=x.nextInt();
i3=x.nextInt();
i4=x.nextInt();
i5=x.nextInt();
}
public void showdata()
{
total=i1+i2+i3+i4+i5;
System.out.println("Total marks is : "+total);
percent=total/5;
System.out.println("Your percent is : "+percent);
}}
class sturesult
{
public static void main(String arg[])
{
grade s4=new grade();
s4.getdata();
s4.showdata();
}
}