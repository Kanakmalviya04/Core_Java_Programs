import java.util.Scanner;
class arr2dtranspose
{
public static void main(String arg[])
{
int a[][]=new int[2][2],i,j;
int b[][]=new int[2][2];
System.out.println("Enter elements of array a");
Scanner x=new Scanner(System.in);
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=x.nextInt();
}}
System.out.println("Matrix of a is :");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print("\t"+a[i][j]);
}
System.out.println();
}
System.out.println("The transpose matrix is :");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
b[i][j]=a[j][i];
System.out.print("\t"+b[i][j]);
}
System.out.println();
}
}
}