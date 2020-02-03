import java.util.Scanner;
class choice1
{
public static void main(String arg[])
{
float a,b,c;
int choice;
System.out.println("Enter the values of a and b");
Scanner x=new Scanner(System.in);
a=x.nextFloat();
b=x.nextFloat();
System.out.println("Press 1 for ADDITION");
System.out.println("Press 2 for SUBSTRSCTION");
System.out.println("Press 3 for MULTIPLICATION");
System.out.println("Press 4 for DIVISION");
choice=x.nextInt();
System.out.println("You Entered The Case Number= "+choice);
switch(choice)
{
case 1:
c=a+b;
System.out.println("ADDITION IS = "+c);
break;
case 2:
c=a-b;
System.out.println("SUBSTRACTION IS = "+c);
break;
case 3:
c=a*b;
System.out.println("MULTIPLICATION IS = "+c);
break;
case 4:
c=a/b;
System.out.println("DIVISION IS = "+c);
break;
default:
System.out.println("You Enter Aa Wrong CASE");
break;
}
}
}