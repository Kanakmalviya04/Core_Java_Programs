import java.util.Scanner;
class method4
{
public static void main(String arg[])
{
int a,b,c;
System.out.println("Enter values of a and b");
Scanner x= new Scanner(System.in);
a=x.nextInt();
b=x.nextInt();
c=calc(a,b);               //calling of function(method)
System.out.println("SUM IS :"+c);
}
static int calc(int x, int y)             //Declaration & Definition
{
int z=x+y;
return(z);
}
}
