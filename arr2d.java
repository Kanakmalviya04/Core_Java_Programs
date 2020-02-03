import java.util.Scanner;
class arr2d
{
public static void main(String arg[])
{
int a[][]=new int[2][2],i,j;
System.out.println("Enter array elements");
Scanner x=new Scanner(System.in);
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=x.nextInt();
}}
System.out.println("Elements are :");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print("\t"+a[i][j]);
}
System.out.println();
}
}
}