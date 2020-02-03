import java.util.Scanner;
class elifleader
{
public static void main(String arg[])
{
int mark;
System.out.println("enter mark");
Scanner x=new Scanner(System.in);
mark=x.nextInt();
if(mark<0)
{
System.out.println("mark is below the range");
}
else if(mark>100)
{
System.out.println("mark is above the range");
}
else if(mark==0)
{
System.out.println("mark is equal to zero");
}
else 
{
System.out.println("your mark is valid");
}
}
}