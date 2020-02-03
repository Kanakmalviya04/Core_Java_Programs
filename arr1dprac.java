import java.util.Scanner;
class arr1dprac
{
public static void main(String arg[])
{
int a[]=new int[5],i;
Scanner x=new Scanner(System.in);
System.out.println("Enter 5 array elements");
for(i=0;i<5;i++)
{
a[i]=x.nextInt();
}
System.out.println("array elemnts are :");
for(i=0;i<5;i++)
{
if(a[i]==3)
{
continue;
}
System.out.println(a[i]);
}
}
}
