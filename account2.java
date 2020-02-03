class bank{
String n="KRATIKA";
int slry=20000;
private String name()
{
return n;
}
protected int cash()
{
return slry;
}
public void total()
{
int t,amount=50000;
t=amount+cash();
System.out.println("Hello : "+name());
System.out.println(" Your Total a/c balance is : "+t);
}}
public class account2
{
public static void main(String ar[])
{
bank j=new bank();
j.total();
}
}