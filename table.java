import java.util.Scanner;
class table
{
public static void main(String arg[])
{
int n,temp;
int i;
System.out.println("Enter the Number");
Scanner x=new Scanner(System.in);
n=x.nextInt();
System.out.println("The Table is");
for(i=1;i<=10;i++)
{
temp=n*i;
System.out.println(+temp);
}
}
}