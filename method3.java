import java.util.Scanner;
class method3
{
public static void main(String arg[])
{
int a,b;
System.out.println("Enter values of a and b");
Scanner x= new Scanner(System.in);
a=x.nextInt();
b=x.nextInt();
calc(a,b);               //calling of function(method)
}
static void calc(int x, int y)             //Declaration & Definition
{
int z=x+y;
System.out.println("SUM IS :"+z);
}
}
