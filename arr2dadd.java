import java.util.Scanner;
class arr2dadd
{
public static void main(String arg[])
{
int a[][]=new int[2][2],i,j;
int b[][]=new int[2][2];
int c[][]=new int[2][2];
System.out.println("Enter elements of array a");
Scanner x=new Scanner(System.in);
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=x.nextInt();
}}
System.out.println("Enter elements of array b");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
b[i][j]=x.nextInt();
}}
System.out.println("Addition is :");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print("\t"+c[i][j]);
}
System.out.println();
}
}
}