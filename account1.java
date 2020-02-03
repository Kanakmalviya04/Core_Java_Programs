class bank
{
int slry=20000;
private int cash()
{
return slry;
}
public void total()
{
int t,amount=30000;
t=amount + cash();
System.out.println("Total a/c balance is : "+t);
}}
public class account1
{
public static void main(String ar[])
{
bank s=new bank();
s.total();
}
}