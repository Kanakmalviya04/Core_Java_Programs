package mypack;
public class first
{
public void showmsg()
{
System.out.println("Hello this is my pack");
}
}

import mypack.first;
public class mypack1
{
public static void main(String arg[])
{
first f=new first();
f.showmsg();
}
}