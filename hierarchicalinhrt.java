class base
{
public String name ="KANNU";
public int id=214214;
public int age=21;
public int a=50,b=25;
public int sum,sub;
}
class derived1 extends base
{
public void show1()
{
sum=a+b;
System.out.println("The NAME of student is : "+name);
System.out.println("The ID of student is : "+id);
System.out.println("The AGE of student is : "+age);
System.out.println("ADDITION  is : "+sum);
}}
class derived2 extends base
{
public void show2()
{
sub=a-b;
System.out.println("SUBSTRACTION  is : "+sub);
}}
class hierarchicalinhrt
{
public static void main(String arg[])
{
derived1 p=new derived1();
p.show1();
derived2 q=new derived2();
q.show2();
}
}