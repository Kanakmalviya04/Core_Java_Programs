import java.util.Scanner;
class arr1dmul
{
public static void main(String arg[])
{
int a[]=new int[50],i,n,mul=1;
System.out.println("how many numbers are you want to enter");
Scanner x=new Scanner(System.in);
n=x.nextInt();
System.out.println("Enter array elements");
for(i=0;i<n;i++)
{
a[i]=x.nextInt();
}
for(i=0;i<n;i++)
{
mul=a[i]*mul;
}
System.out.println("MUL IS :"+mul);
}
}
