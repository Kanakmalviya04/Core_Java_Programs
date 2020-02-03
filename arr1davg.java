import java.util.Scanner;
class arr1davg
{
public static void main(String arg[])
{
int a[]=new int[50],i,n,sum=0;
float avg;
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
sum=a[i]+sum;
}
System.out.println("SUM IS :"+sum);
avg=sum/n;
System.out.println("AVERAGE IS :"+avg);
}
}
