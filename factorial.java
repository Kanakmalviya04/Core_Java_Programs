import java.util.Scanner;
class factorial
{
public static void main(String arg[])
{
int n,i;
int fact=1;
System.out.println("Enter the Number");
Scanner x=new Scanner(System.in);
n=x.nextInt();
System.out.println("The FACTORIAL is");
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(+fact);
}
}