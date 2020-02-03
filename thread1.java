import java.util.Scanner;
import java.lang.Thread;
class first extends Thread
{
public void run()
{
int n,temp;
System.out.println("Enter any number");
Scanner t=new Scanner(System.in);
n=t.nextInt();
System.out.println("Table is :-");
try
{
for(int i=1;i<=10;i++)
{
temp=n*i;
sleep(400); 
System.out.println(+temp);
}
}
catch(Exception d)
{
System.out.println(d.getMessage());
}}
}
class thread1
{
public static void main(String arg[])
{
first g=new first();
g.start();
}
}