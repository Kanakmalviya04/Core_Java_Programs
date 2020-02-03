import java.util.Scanner;
class arrevenodd
{
public static void main(String arg[])
{
int a[]=new int[25],i,n;
System.out.println("how many numbersdo u want enter");
Scanner x=new Scanner(System.in);
n=x.nextInt();
System.out.println("Enter array elements");
for(i=0;i<n;i++)
{
a[i]=x.nextInt();
}
System.out.println("numbers are :");
for(i=0;i<n;i++)
{
if(a[i]%2==0)
{
a[i]=a[i]+2;
}
else
{
a[i]=a[i]+1;
}
System.out.println(a[i]);
}
}
}