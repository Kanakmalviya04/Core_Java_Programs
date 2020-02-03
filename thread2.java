import java.lang.Thread;
class first extends Thread
{
public void run()
{
try
{
for(int i=0;i<10;i++)
{
sleep(500);
System.out.println("Loop 'I' is called : "+i);
}}
catch(Exception u)
{
System.out.println(u.getMessage());
}
}}
class second extends Thread
{
public void run()
{
try
{
for(int j=0;j<10;j++)
{
sleep(500);
System.out.println("Loop 'J' is called : "+j);-
}}
catch(Exception u)
{
System.out.println(u.getMessage());
}
}}
class third extends Thread
{
public void run()
{
try
{
for(int k=0;k<10;k++)
{
sleep(500);
System.out.println("Loop 'K' is called : "+k);
}}
catch(Exception u)
{
System.out.println(u.getMessage());
}
}}
public class threadmulti2
{
public static void main(String ar[])
{
first f=new first();
f.start();
second s=new second();
s.start();
third t=new third();
t.start();
}
}