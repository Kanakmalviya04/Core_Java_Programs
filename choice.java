import java.util.Scanner;
class choice
{
public static void main(String arg[])
{
int subject;
System.out.println("Enter any case between 1 to 5");
Scanner x=new Scanner(System.in);
subject=x.nextInt();
switch(subject)
{
case 1:
System.out.println("You select 'C' language");
break;
case 2:
System.out.println("You select 'C++' language");
break;
case 3:
System.out.println("You select 'PHP' language");
break;
case 4:
System.out.println("You select 'JAVA' language");
break;
case 5:
System.out.println("You select 'HTML/CSS' language");
break;
default:
System.out.println("You select a wrong CASE");
break;
}
}
}