import java .util.Scanner;
class oddnums
{
public static void main(String arg[])
{
int n;
System.out.println("enter any numbers");
Scanner o1=new Scanner(System.in);
n=o1.nextInt();
if(n%2==0)
{
System.out.println("number is even"+n);
}
else
{
System.out.println("number is odd"+n);
}
}
}
