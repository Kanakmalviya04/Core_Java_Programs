import java.util.Scanner;
class method2
{
public static void main(String arg[])
{
int k;
k=calc();               //calling of function(method)
System.out.println("SUM IS :"+k);
}
static int calc()             //Declaration & Definition
{
int a,b,c;
System.out.println("Enter values of a and b");
Scanner x= new Scanner(System.in);
a=x.nextInt();
b=x.nextInt();
c=a+b;
return (c);
}
}
