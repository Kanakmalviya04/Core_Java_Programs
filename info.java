import java.util.Scanner;
class account
{
public String name;
public int slry,ta;
public void getinfo()
{
System.out.println("Enter name,salary and total amount");
Scanner x=new Scanner(System.in);
name=x.next();
slry=x.nextInt();
ta=x.nextInt();
}
public void showinfo()
{
System.out.println("Welcome dear user : "+name);
System.out.println("Your total account balance is : "+(slry+ta));
}}
class info
{
public static void main(String arg[])
{
account a1=new account();
a1.getinfo();
a1.showinfo();
}
}
